package in.co.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {

		// Elements are Sorted and ordered in TreeSet

		TreeSet t = new TreeSet();

		t.add("a");
		t.add("g");
		t.add("c");
		t.add("r");
		// t.add(null); // it doesn't take null values

		System.out.println(t);

		for (Object ele : t) {
			System.out.println(ele);
		}
		System.out.println(t.first());
		System.out.println(t.last());

		Iterator it = t.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		
		
		/*
		 * Object f = t.descendingSet(); System.out.println(f);
		 * 
		 * Object a = t.first(); System.out.println(a);
		 * 
		 * Object c = t.last(); System.out.println(c);
		 * 
		 * Object d = t.pollFirst(); System.out.println(d);
		 * 
		 * Object e = t.pollLast(); System.out.println(e);
		 */
	}

}
