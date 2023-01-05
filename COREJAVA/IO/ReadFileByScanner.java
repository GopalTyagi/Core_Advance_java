package in.co.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileByScanner {
	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader ("C:\\Users\\DELL\\Desktop\\HARI\\gopal.txt");
		Scanner sc = new Scanner(reader);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		reader.close();
	}

}
