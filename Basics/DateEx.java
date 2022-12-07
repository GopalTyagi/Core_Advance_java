package in.co.Basics;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateEx {
public static void main(String[] args) throws ParseException{ 
	
		//Gives current date in java format 
		Date d = new Date();
		System.out.println(d);
	 	
		 
		//Date formatting into our format 
		SimpleDateFormat sdf= new SimpleDateFormat ("dd/MM/yyyy");
		String str = sdf.format (d);
		System.out.println(str);
		
		
		//parsing date into java's format 
		String a = "06/12/2022";
		System.out.println(a);
		
		Date d1 = sdf.parse(a);
		System.out.println(d1);
		
		
	}
}

