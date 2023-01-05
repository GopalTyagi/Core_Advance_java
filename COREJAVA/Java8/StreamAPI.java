package in.co.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		//Create a collection 
		List<String> items = Arrays.asList("one","two","three","three","four","five");
		
		//Create Stream
		/*Stream<String> st = items.stream();
		items.Stream().filter(e -> e.startwith("T")).distinct().map(e -> e.touppercase()).sorted().foreach(e ->{
			System.out.println(e);
		});
	}*/

}
}