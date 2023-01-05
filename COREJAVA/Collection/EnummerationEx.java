package in.co.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnummerationEx {
	public static void main(String[] args) {
		int i = 2;
		Vector v = new Vector(i);
		v.add("ram");
		v.add("shayam");
		v.add("lakhan");

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
			if (i == 2) {
				v.add("raman"); // We cannot add anything inside Enumeration blocks
			}
			
		
		System.out.println(v);
	}
}
