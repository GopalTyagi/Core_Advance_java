package in.co.Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {

		Queue q = new PriorityQueue();
		q.add("one");
		q.add("two");
		q.add("three");
		q.add("four");

		System.out.println(q);

		Object ele = q.element(); // Examine top element System.out.println(ele);
      //  System.out.println(ele);
		
		ele = q.remove(); // Remove top element System.out.println(ele);
		System.out.println(q);

		for (Object o : q) {
			System.out.println(o);
		}

		Iterator it = q.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		/*
		 * Object b = q.peek(); System.out.println(b);
		 * 
		 * Object d = q.poll(); System.out.println(d);
		 * 
		 * Object e = q.isEmpty(); System.out.println(e);
		 */

	}

}
