package in.co.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryData {

	public static void main(String[] args) throws IOException {

		String source = "C:/blackbg3.jpg";
		String target = "C:/blackbg.jpg";

		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int ch = in.read();
		while (ch != -1) {
			out.write(ch);
			ch = in.read();
		}
		in.close();
		out.close();

		System.out.println(source + " is copied to" + target);

	}

}
