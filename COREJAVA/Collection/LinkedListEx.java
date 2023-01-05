package in.co.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();

		l.add("one");
		l.add("two");
		l.add("three");
		l.add("four");

		System.out.println(l);

		for (Object ele : l) {
			System.out.println(ele);
		}
		System.out.println(l.isEmpty());

		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		/*
		 * Object a = l.clone(); System.out.println(a);
		 * 
		 * Object b = l.get(2); System.out.println(b);
		 * 
		 * Object c = l.peek(); System.out.println(c);
		 * 
		 * Object d = l.pop(); System.out.println(d);
		 * 
		 * Object e = l.remove(2); System.out.println(e);
		 * 
		 * Object f = l.contains("one"); System.out.println(f);
		 * 
		 * Object i = l.size(); System.out.println(i);
		 */
	}

}
