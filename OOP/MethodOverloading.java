package in.co.OOP;

public class MethodOverloading {
	public static void main(String[] args) {
	  display (1);
	  display (1,4);
	  display ("Hey","Hello","Hii");
	  display (1,2,3,4);
	}
	private static void display (int s, int t , int u , int v) {
		System.out.println(s+","+ t +"," + u +","+v);
	}
	private static void display (int s) {
	    System.out.println("Argument " + s);	
	} 
	private static void display (int i, int j) {
		System.out.println("Argument " + i + " & " + j);
	}
    private static void display(String s , String t ,String u) {
    	System.out.println("Argument " + s + "," + t + "," + u);
    
    }
}
