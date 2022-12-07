package in.co.Basics;

public class TestSum {
	public static void main(String[] args) {
		int n =12;
		int m =1;

		Add a = new Add ();
		int value = a.add(n, m);
		System.out.println(value);
		
		int c = 21;
		int d = 12;
		
		Add q = new Add();
		int subtract = q.substraction(c, d);
		System.out.println(subtract);
		
		
		int g =12;
		int h = 32;
		
		Add w = new Add();
		int multiply = w.multiply(g, h);
		System.out.println(multiply);
		
	}
}
 