afplib
======

JAVA Library for reading &amp; writing AFP (Advanced Function Presentation) Files. See https://en.wikipedia.org/wiki/Advanced_Function_Presentation

afplib provides a low level API to transform AFP files, i.e. structured fields, triplets, ... into JAVA objects and vice versa. To make use of it you need to know MO:DCA (see http://afpcinc.org/wp-content/uploads/2016/08/MODCA-Reference-Mixed-Object-Document-Content-Architecture-Reference.pdf). afplib is build on top of EMF (Eclipse Modeling Framework) - http://www.eclipse.org/modeling/emf/

Home: http://afplib.org

How to get started
------------------

Create a new maven project (https://maven.apache.org)

Use a pom like this:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>org.afplib.samples</groupId>
	<artifactId>HelloWorld</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<dependencies>
		<dependency>
			<groupId>org.afplib</groupId>
			<artifactId>afplib</artifactId>
			<version>0.0.11</version>
		</dependency>
		<dependency>
			<groupId>org.eclipse.emf</groupId>
			<artifactId>org.eclipse.emf.ecore</artifactId>
			<version>2.10.1</version>
		</dependency>
		<dependency>
			<groupId>org.eclipse.emf</groupId>
			<artifactId>org.eclipse.emf.common</artifactId>
			<version>2.10.1</version>
		</dependency>
		<dependency>
			<groupId>org.eclipse.emf</groupId>
			<artifactId>org.eclipse.emf.ecore.xmi</artifactId>
			<version>2.10.1</version>
		</dependency>
	</dependencies>

	<build>
		<sourceDirectory>src</sourceDirectory>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.1</version>
				<configuration>
					<source>1.7</source>
					<target>1.7</target>
				</configuration>
			</plugin>
		</plugins>
	</build>
</project>
```

Create a Hello World App

```java
import java.io.FileOutputStream;
import java.io.IOException;

import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.BDT;
import org.afplib.afplib.Comment;
import org.afplib.afplib.EDT;
import org.afplib.io.AfpOutputStream;


public class HelloWorld {

	public static void main(String[] args) {
		try (AfpOutputStream aout = new AfpOutputStream(new FileOutputStream("hello.afp"))) {

			BDT bdt = AfplibFactory.eINSTANCE.createBDT();
			bdt.setDocName("HELLOWLD");
			Comment comment = AfplibFactory.eINSTANCE.createComment();
			comment.setComment("My first AFPLib Program");
			bdt.getTriplets().add(comment);
			
			aout.writeStructuredField(bdt);

			EDT edt = AfplibFactory.eINSTANCE.createEDT();
			edt.setDocName("HELLOWLD");
			aout.writeStructuredField(edt);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
```

Overview
--------

Have a look on the definition of Begin Document (BDT) - MOD:CA reference page 128:
![BDT](https://raw.githubusercontent.com/yan74/afplib/master/org.afplib/docs/BDT-Definition.png)

and afplib's representation of it:

```java
...
public interface BDT extends SF {
	String getDocName();
	void setDocName(String value);

	Integer getReserved();
	void setReserved(Integer value);

	EList<Triplet> getTriplets();
} // BDT
```

afplib frees you from creating the structured field introducer (ID, calculating structured field length), and knowing which attributes at what position and length a structured field has.

Consider e.g. following file:

5A002BD3A8A8000000C8C5D3D3D6E6D3C400001965D4A840868999A2A340C1C6D7D3898240D79996879981945A0010D3A9A8000001C8C5D3D3D6E6D3C4

or broken down:

| hex code | description|
| -------- | -----------|
|5A 00 2B | magic byte (5a) and length|
|D3 A8 A8 00 00 00 | id (BDT) and flags|
|C8 C5 D3 D3 D6 E6 D3 C4 00 00 | DocName = HELLOWLD (EBCDIC) |
|19 65 | Triplet Length and ID (Comment)|
|D4 A8 40 86 89 99 A2 A3 40 C1 C6 D7 D3 89 82 40 D7 99 96 87 99 81 94| My first AFPLib Program (EBCDIC)|
|5A 00 10 | magic byte and length|
|D3 A9 A8 00 00 01| id (EDT) and flags|
|C8 C5 D3 D3 D6 E6 D3 C4|DocName = HELLOWLD (EBCDIC) |

afplib transforms this binary data into the following:
```java
		try(AfpInputStream ain = new AfpInputStream(new FileInputStream("hello.afp"))) {
			
			BDT bdt = (BDT) ain.readStructuredField();
			EDT edt = (EDT) ain.readStructuredField();
			
			System.out.println(bdt.getDocName());
			System.out.println(bdt.getReserved());
			System.out.println(bdt.getTriplets().size());
			System.out.println(((Comment)bdt.getTriplets().get(0)).getComment());

			System.out.println(edt.getDocName());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
```
Output:
```bash
HELLOWLD                # System.out.println(bdt.getDocName());
0                       # System.out.println(bdt.getReserved());
1                       # System.out.println(bdt.getTriplets().size());
My first AFPLib Program # System.out.println(((Comment)bdt.getTriplets().get(0)).getComment());
HELLOWLD                # System.out.println(edt.getDocName());
```


