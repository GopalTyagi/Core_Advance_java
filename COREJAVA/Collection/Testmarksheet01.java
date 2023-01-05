package in.co.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Testmarksheet01 {
	public static void main(String[] args) {
		
		ArrayList marksheet = new ArrayList();
		marksheet.add(new MarkSheet ("a1","aman",90));
		marksheet.add(new MarkSheet ("a2","pragati",160));
		marksheet.add(new MarkSheet ("b1","goli",187));
		
		OrderByName cname = new OrderByName ();
		Collections.sort(marksheet ,cname);
		
		for(Object o : marksheet) {
			System.out.println(o);
		}
		
		OrderByMarks cmarks = new OrderByMarks();
		Collections.sort(marksheet , cmarks);
		
		for (Object o : marksheet) {
			System.out.println(o);
		}
		
		OrderByMarks croll = new OrderByMarks();
		Collections.sort(marksheet , croll);
		
		for (Object p : marksheet) {
			System.out.println(p);
		}
	}

}
