package in.co.Collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.Collection;
import java.util.Collections;

public class Practise {
	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add("ram");
		l.add("shyam");
		l.add("lakhan");
		l.add("bharat");

		System.out.println(l);
		System.out.println(l.size());

		for (Object ele : l)
			System.out.println(ele);

		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

		/*
		 * LinkedList a = new LinkedList(); a.add("gopal"); a.add("ram");
		 * a.add("suresh"); a.add("radhe");
		 * 
		 * System.out.println(a);
		 * 
		 * for (Object p : a) System.out.println(p);
		 * 
		 * Object b = a.get(3); System.out.println(a);
		 * 
		 * Object c = a.peek(); System.out.println(c);
		 * 
		 * Object d = a.getFirst(); System.out.println(d);
		 * 
		 * Object e = a.removeLast(); System.out.println(e); System.out.println(a);
		 */

		/*
		 * Queue q = new LinkedList(); // q.add(12); // q.add(2); // q.add(54);
		 * 
		 * for (int i = 0; i < 5; i++) { q.add(i); } System.out.println(q);
		 * 
		 * int size = q.size(); System.out.println(size);
		 * 
		 * int f = (int) q.remove(); System.out.println(f); System.out.println(q);
		 * 
		 * Iterator h = q.iterator(); while (h.hasNext()) {
		 * System.out.println(h.next()); }
		 * 
		 * Object j = q.removeAll(q); System.out.println(j);
		 * 
		 * Object k = q.isEmpty(); System.out.println(k);
		 */

		/*
		 * Stack s = new Stack();
		 * 
		 * s.push("raj"); s.push("krati"); s.push("imran"); s.push("dinesh");
		 * 
		 * System.out.println( s.peek()); System.out.println(s.pop());
		 * System.out.println(s.empty()); System.out.println(s.search("raj"));
		 * for(Object ele : s) { System.out.println(ele); } Iterator it = s.iterator();
		 * while(it.hasNext()){ System.out.println(it.next());
		 */

		/*
		 * Deque d = new ArrayDeque(); d.push("one"); d.push("two"); d.push("three");
		 * d.push("four");
		 * 
		 * for (Object ele1 : d) { System.out.println(ele1); } Iterator iti =
		 * d.iterator(); while (iti.hasNext()) { System.out.println(iti.next()); }
		 * System.out.println(d); System.out.println(d.element());
		 * System.out.println(d.getFirst()); System.out.println(d.getLast());
		 * System.out.println(d.offerFirst("Zero"));
		 * System.out.println(d.offerLast("five")); System.out.println(d.peek());
		 * System.out.println(d.size()); System.out.println(d.remove());
		 */

		/*
		 * Vector v = new Vector(); for(int i=1; i<10; i++) { v.add(i); }
		 * System.out.println(v); for (Object ele2 : v) { System.out.println(ele2);
		 * Iterator i = v.iterator(); while(i.hasNext()) { System.out.println(i.next());
		 * } } System.out.println(v.capacity()); System.out.println(v.elementAt(4));
		 * System.out.println(v.firstElement()); System.out.println(v.indexOf(5));
		 * System.out.println(v.lastElement()); System.out.println(v.remove(2));
		 * System.out.println(v.size());
		 */

		/*
		 * HashSet h = new HashSet(); h.add("a"); h.add("g"); h.add("t"); h.add("w");
		 * 
		 * for (Object ele3 : h) { System.out.println(ele3); } Iterator it =
		 * h.iterator(); while (it.hasNext()) { System.out.println(it.next()); }
		 * 
		 * System.out.println(h.clone()); System.out.println(h.remove("a"));
		 * System.out.println(h.size()); System.out.println(h.retainAll(h));
		 * System.out.println(h.isEmpty());
		 */

		/*
		 * HashMap h = new HashMap(); h.put(01, "ram"); h.put(02, "shyam"); h.put(03,
		 * "lakhan"); h.put(04, "bharat"); h.put(05, "gopal");
		 * 
		 * 
		 * Set keys = h.keySet(); System.out.println(keys);
		 * 
		 * Collection values = h.values(); for (Object ele : values) {
		 * System.out.println(ele); } Set keyvalue = h.entrySet(); for (Object ele :
		 * keyvalue) { Map.Entry pair = (Map.Entry) ele;
		 * System.out.println(pair.getKey() + "_" + pair.getValue());
		 * 
		 * }
		 */

		/* ENUMERATION */

		/*
		 * Vector a = new Vector(); a.add("ram"); a.add("raj"); a.add("ravi");
		 * 
		 * // System.out.println(a); Enumeration e = a.elements(); while
		 * (e.hasMoreElements()) { System.out.println(e.nextElement()); //
		 * a.add("rati");
		 * 
		 * } System.out.println(a);
		 * 
		 */

		/*
		 * LinkedList l = new LinkedList (); l.add("hari"); l.add("lal");
		 * l.add("bhagwan"); l.add("shankar");
		 * 
		 * 
		 * Iterator it = l.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next());
		 * 
		 * l.add("devdas"); }
		 */

	}
}