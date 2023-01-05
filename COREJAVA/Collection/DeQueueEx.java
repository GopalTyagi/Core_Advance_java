package in.co.Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DeQueueEx {
	public static void main(String[] args) {

		// ArrayDeque d = new ArrayDeque();
		// Deque d = new ArrayDeque();
		Deque d = new LinkedList();
		d.add("one");
		d.add("two");
		d.add("three");
		d.add("four");
		d.addFirst("five");
		d.addLast("six");

		System.out.println(d);

		Object h = d.remove(); // remove top element
		System.out.println(h);
		System.out.println(d);

		Object i = d.removeFirst(); // remove top element
		System.out.println(i);
		System.out.println(d);

		for (Object ele : d) {
			System.out.println(ele);
		}

		Iterator m = d.iterator();
		while (m.hasNext())
			System.out.println(m.next());

		
		
		/*
		 * Object a = d.element(); System.out.println(a);
		 * 
		 * Object b = d.getFirst(); System.out.println(b);
		 * 
		 * Object c = d.getLast(); System.out.println(c);
		 * 
		 * Object e = d.peek(); System.out.println(e);
		 * 
		 * Object f = d.poll(); System.out.println(f); System.out.println(d);
		 * 
		 * Object g = d.pop(); System.out.println(g); System.out.println(d);
		 * 
		 * Object j = d.isEmpty(); System.out.println(j);
		 * 
		 * Object k = d.peekLast(); System.out.println(k);
		 * 
		 */	}

}
