package in.co.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializable {
	public static void main(String[] args) throws IOException {
	
		 FileOutputStream file = new FileOutputStream("C:\\Users\\DELL\\Desktop\\demo.txt");
		 ObjectOutputStream Out = new ObjectOutputStream(file);
		 
		 MarkSheetSer m = new MarkSheetSer();
		 m.setName("ram");
		 m.setMaths(94);
		 m.setPhysics(89);
		 m.setChemistry(90);
		 m.setTempValue("868");
		 
		 Out.writeObject(m);
		 System.out.println("Done");
	}

}
