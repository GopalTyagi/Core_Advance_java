package in.co.Java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
	public static void main(String[] args) {
     List<String> l = new ArrayList<String>();
	    l.add("one");
	    l.add("two");
	    l.add("three");
	    l.forEach(list -> System.out.println(list));
	
	}
}
