 package in.co.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadbyL {
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("C://Users//DELL//Desktop//demo.txt");
	    BufferedReader in = new BufferedReader(file);
	    String line = in.readLine();
	    while(line != null) {
	    	System.out.println(line + "\t");
	    	line = in.readLine();
	    }
	    
	    in.close();
	    file.close();
	
	
	
	}

}
