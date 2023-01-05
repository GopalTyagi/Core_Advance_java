package in.co.Collection;

import java.util.Comparator;

public class OrderByRollno implements Comparator <MarkSheet> {

	public int compare(MarkSheet o1, MarkSheet o2) {
		// TODO Auto-generated method stub
		return o1.rollno.compareTo(o2.rollno) ;
	}


}
