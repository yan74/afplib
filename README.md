afplib
======

JAVA Library for reading &amp; writing AFP (Advanced Function Presentation) Files. See https://en.wikipedia.org/wiki/Advanced_Function_Presentation

afplib provides a low level API to transform AFP files, i.e. structured fields, triplets, ... into JAVA objects and vice versa. To make use of it you need to know MO:DCA (see http://afpcinc.org/wp-content/uploads/2014/04/modca08.pdf). afplib is build on top of EMF (Eclipse Modeling Framework) - http://www.eclipse.org/modeling/emf/

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
			<version>0.0.9</version>
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
![BDT](docs/BDT-Definitions.png)

