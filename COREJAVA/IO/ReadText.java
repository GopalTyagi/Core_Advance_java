package in.co.IO;

import java.io.FileReader;
import java.io.IOException;

public class ReadText {
	public static void main(String[] args) throws IOException {
		
		FileReader in = new FileReader ("C://Users//DELL//Desktop//demo.txt");
		int ch = in.read();
		while(ch != -1) {
			System.out.println((char)ch);
			ch = in.read();
			
		}
		in.close();
	}

}
