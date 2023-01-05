package in.co.Collection;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
        
		System.out.println(stack);
		
		for (Object ele : stack) {
			System.out.println(ele);
		}

		Iterator it = stack.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		/*
		 * 
		 * Object objTop = stack.peek(); System.out.println(objTop);
		 * System.out.println(stack);
		 * 
		 * Object obj4 = stack.pop(); System.out.println(obj4);
		 * System.out.println(stack);
		 * 
		 * Object obj3 = stack.pop(); System.out.println(obj3);
		 * System.out.println(stack);
		 * 
		 * Object obj2 = stack.pop(); System.out.println(obj2);
		 * System.out.println(stack);
		 * 
		 * Object obj1 = stack.pop(); System.out.println(obj1);
		 * System.out.println(stack); System.out.println(stack.isEmpty());
		 */
	}

}
