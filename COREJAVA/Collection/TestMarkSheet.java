package in.co.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarkSheet {
	public static void main(String[] args) {
		
		ArrayList MarkSheet = new ArrayList();
		//MarkSheet m = new MarkSheet("b1","zam",103);
		//MarkSheet m1 = new MarkSheet("a2","ankit",102);
		//MarkSheet m2 = new MarkSheet("a3","gopal",101);
		MarkSheet.add(new MarkSheet("b2","ram",123));
		MarkSheet.add(new MarkSheet("a2","raj",893));
		MarkSheet.add(new MarkSheet("c4","chotu",893));
		
		Collections.sort(MarkSheet);
		
		for(Object o : MarkSheet) {
			System.out.println(o);
		}
}
	}
