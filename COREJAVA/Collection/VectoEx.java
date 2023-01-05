package in.co.Collection;

import java.util.Vector;

public class VectoEx {
	public static void main(String[] args) {
		// size of the vector
		int n = 5;
		
		// declaring the vector with initial Size n
		Vector v = new Vector(n);

		// Appending new elements at the end of the vector
		for (int i = 1; i <= n; i++)
			v.add(i);
		
		// Printing elements
		System.out.println(v);

		// Remove elements at index 3
		v.remove(3);

		// Displaying the vector
		// After deletion
		System.out.println(v);
		
		// iterating over vector elements using for loop
		for (int i = 0; i < v.size(); i++)

		// printing elements one by one
			System.out.println(v.get(i) + " ");

		
		
		/*
		 * Object a = v.firstElement(); System.out.println(a);
		 * 
		 * Object b = v.lastElement(); System.out.println(b);
		 * 
		 * Object c = v.remove(2); System.out.println(c);
		 * 
		 * Object d = v.capacity(); System.out.println(d);
		 * 
		 * Object e = v.isEmpty(); System.out.println(b);
		 */
	}

}
