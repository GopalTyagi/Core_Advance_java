package in.co.Basics;

public class MethodStatic {
	public static void main(String[] args) {
		int n = 2;
		int m = 4;
		
		int value = MethodStatic.sum(n,m);
		System.out.println(value);
	}
	
	public static int sum(int c,int d) {
		return c+d;
	}
}
 