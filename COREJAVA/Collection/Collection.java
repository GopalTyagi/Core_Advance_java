package in.co.Collection;

import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {

		ArrayList c = new ArrayList();

		// Add elements into collection

		c.add("Bura mat dekho");
		c.add("Bura mat suno");
		c.add("Bura mat kaho");

		System.out.println("Length of collection is " + c.size());

		// Print all elements of a Collection

		for (Object ele : c) {
			System.out.println(ele);

		} // Convert Collection to array

		Object[] arr = c.toArray();

		// print all elements of Array

		for (Object ele : arr) {
			String s = ele.toString();
			System.out.println(ele);
		}

		/*
		 * ArrayList a = new ArrayList();
		 * 
		 * a.add("one"); a.add("Two"); a.add("three"); a.add("four");
		 * 
		 * System.out.println(a);
		 * 
		 * int Size = a.size(); System.out.println(Size);
		 * 
		 * for (int i = 0; +i < a.size(); i++) { System.out.println(i + ":" + a.get(i));
		 * } for (Object obj : a) { System.out.println(obj); }
		 * 
		 * Integer i = new Integer(4); a.add(i); System.out.println(a);
		 * 
		 * ArrayList subList = new ArrayList(a.subList(0, 2));
		 * System.out.println(subList);
		 */
	}

}
