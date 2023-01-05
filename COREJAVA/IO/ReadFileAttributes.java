package in.co.IO;

import java.io.File;
import java.util.Date;

public class ReadFileAttributes {
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\DELL\\Desktop\\HARI\\gopal.txt");
		
		if(f.exists()) { //check if file exists
			
			System.out.println("Name : " + f.getName());
			System.out.println("Absolute path : " + f.getAbsolutePath());
			System.out.println("Is Writable : " + f.canWrite());
			System.out.println("Is Readable : " + f.canRead());
			System.out.println("Is File : " + f.isFile());
			System.out.println("Is Directory : " + f.isDirectory());
			System.out.println("Last Modified at : " + new Date(f.lastModified()));
			System.out.println("Size : " + f.length() + "bytes long.");
		}
		else {
			System.out.println("File does not exist");
		}
	}

}
