package in.co.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestExternalizableSer {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\DELL\\Desktop\\HARI\\gopal.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		ExternalizableEx ext = new ExternalizableEx();
		
		ext.setName("gopal");
		ext.setPhysics(70);
		ext.setChemistry(65);
		ext.setMaths(98);
		ext.setTemp(788);
		out.writeObject(ext);
		
		out.close();
		file.close();
		System.out.println("Done");
		
		
		
		
		
		
		
		
		
	}

}
