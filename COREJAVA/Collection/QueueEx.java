package in.co.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// We cannot add null value in a queue

		Queue q = new LinkedList();

		// q.add(null);
		// Adds elements {0,1,2,3,4} to the queue

		for (int i = 0; i < 5; i++) {
			q.add(i);
		}
		// Display contents of the queue

		System.out.println("Element of queue" + q);

		// To remove the head of queue

		int removeEle = (int) q.remove();
		System.out.println(removeEle);
		System.out.println(q);

		// To view the head of queue

		int head = (int) q.peek();
		System.out.println("head of queue" + head);

		// Rest all methods of collection
		// interface like size and contains
		// can be used with this implementation

		int size = q.size();
		System.out.println(size);

		Iterator it = q.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());
		}
		
	}
}