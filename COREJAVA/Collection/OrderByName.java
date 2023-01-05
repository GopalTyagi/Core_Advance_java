package in.co.Collection;

import java.util.Comparator;

public class OrderByName implements Comparator <MarkSheet> {
    
	
	@Override
	public int compare(MarkSheet m1, MarkSheet m2) {
		// TODO Auto-generated method stub
		return m1.rollno.compareTo(m2.rollno);
	}

}
    