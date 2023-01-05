package in.co.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {

		// Creating a HashSet Object of String type

		HashSet h = new HashSet();
		h.add("hey"); // Adding Elements to HashSet using add() method
		h.add("hi");
		h.add("hello");
		h.add("hubby");
		h.add(null); // it takes null value but only once

		System.out.println(h);

		// Duplicate removed 
		// h.add("hey");

		for (Object ele : h) {
			System.out.println(ele);
		}

		Iterator g = h.iterator();
		while (g.hasNext()) {
			System.out.println(g.next());
		}

		/*
		 * Object a = h.remove("hi"); System.out.println(a);
		 * 
		 * Object b = h.clone(); System.out.println(b);
		 * 
		 * Object d = h.isEmpty(); System.out.println(d);
		 * 
		 * Object e = h.size(); System.out.println(e);
		 */
	}
}
