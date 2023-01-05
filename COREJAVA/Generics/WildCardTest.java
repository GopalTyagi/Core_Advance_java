package in.co.Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest {
           //Display all numbers
	
	public static void display(List <? extends Number> list) {
		for(Number e : list) {
			System.out.println(e);
		}
	}
	
	//adds all the numbers
	public static double sum(List<? extends Number>list) {
		double total = 0;
		for(Number e : list) {
			total += e.doubleValue();
		}
		return total ;
	}
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(11);
		l.add(12);
		l.add(13);
		
		display(l);
		System.out.println(sum(l));
		
		
		
		
		
		
		
		
		
		
	}
}
