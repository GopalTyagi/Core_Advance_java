package in.co.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestExternalizableDes {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\HARI\\gopal.txt");
	    ObjectInputStream in = new ObjectInputStream (file);
	    ExternalizableEx ext = (ExternalizableEx)in.readObject();
	    
	    System.out.println("Name = " + ext.getName());
	    System.out.println("physics = " + ext.getPhysics());
	    System.out.println("chemistry = " + ext.getChemistry());
	    System.out.println("maths = " + ext.getMaths());
	    System.out.println("temp = " + ext.getTemp());
	    
	    in.close();
	    file.close();

	}

}
