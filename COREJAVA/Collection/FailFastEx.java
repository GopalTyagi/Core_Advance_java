package in.co.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class FailFastEx {
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList ();
		l.add("one");
		l.add("two");
		l.add("three");
		
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		   l.add("four");   //We cannot add in Iterator 
		
		}   
		    //if we add we found Exception -ConcurrentModificationException
	}

}
