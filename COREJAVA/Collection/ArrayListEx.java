package in.co.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add("one");
		l.add("two");
		l.add("three");
		l.add(6);
		l.add(7);

		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println(l.get(4));

		int i = (int) l.get(3);
		int j = (int) l.get(4);
		System.out.println(i + j);


		ArrayList v = new ArrayList();
		v.add("ram");
		v.add("vikas");
		v.add("shyam");
		v.add(768);
		v.add(3.04);
		v.add("oye ");

		System.out.println(v);
		int s = (int) v.get(3);
		double d = (double) v.get(4);
		System.out.println(s + d);

		Iterator it = v.iterator();
		 while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
	}
}
