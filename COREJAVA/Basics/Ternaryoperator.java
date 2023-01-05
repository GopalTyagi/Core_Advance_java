package in.co.Basics;

public class Ternaryoperator {
	public static void main(String[] args) {
		
		int num1=52;
		int num2=49;
		
		//Ternary/conditional operator
		//condition ? expressional to be executed if condition true :
		// condition is false ;
		 
		int greater = (num1 > num2) ? num1 : num2;
		System.out.println( "Larger number is " + greater ); //52
		
		int a=21; 
		int b=32;
		
		int smaller = (a < b) ? a:b;
		System.out.println("smaller number is " + smaller);  //21
		
		
		int A=24;
		int C=87;
		
		
		int greater1 = (A > C)  ? A:C;
		System.out.println("greater1 number is " +  greater1);  //87
		
		
		int G=132;
		int H=198;
		
		int great =( H > G) ? H:G ;
		System.out.println("great number is " + great );  //198
		
		
		int q=12;
		int w=13;
		String s = "t";
				
		int t = (w<q) ? q : w ;
		System.out.println("addition is " + t);   //13
		
		
		
	}
 
}
