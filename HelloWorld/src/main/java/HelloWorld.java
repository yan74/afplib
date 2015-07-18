import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.BDT;
import org.afplib.afplib.Comment;
import org.afplib.afplib.EDT;
import org.afplib.io.AfpInputStream;
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
		
		try(AfpInputStream ain = new AfpInputStream(new FileInputStream("hello.afp"))) {
			
			BDT bdt = (BDT) ain.readStructuredField();
			EDT edt = (EDT) ain.readStructuredField();
			
			System.out.println(bdt.getDocName());
			System.out.println(bdt.getReserved());
			System.out.println(bdt.getTriplets().size());
			System.out.println(((Comment)bdt.getTriplets().get(0)).getComment());

			System.out.println(edt.getDocName());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
