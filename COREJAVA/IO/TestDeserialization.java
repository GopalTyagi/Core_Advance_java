package in.co.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\DELL\\Desktop\\demo.txt");
		ObjectInputStream in = new ObjectInputStream (file);
		
		MarkSheetSer m = (MarkSheetSer) in.readObject();
		
		System.out.println("Name : " + m.getName());
		System.out.println("Maths : " + m.getMaths());
		System.out.println("Physics : " + m.getPhysics());
		System.out.println("Chemistry : " + m.getChemistry());
		System.out.println("TempValue : " + m.getTempValue());
		
	}

}
