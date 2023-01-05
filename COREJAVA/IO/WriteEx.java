package in.co.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteEx {
  public static void main(String[] args) throws IOException {
	
	 FileWriter out = new FileWriter ("C:\\Users\\DELL\\Desktop\\Object1.txt");
	 
	 out.write('A');
	 out.write('B');
	 out.write("\n");
	 out.write("This is line one");
	 out.write("\n");
	 out.write("This is line second");
	 
	 out.close();
	 System.out.println("C:\\Users\\DELL\\Desktop\\Object1.txt");
	  
	 
}
}
