package in.co.Basics;

import java.util.ArrayList;

public class Loops { 
	
	  
public static void main(String[] args) {
	
	//for (initialisation ; condition ; updation)
	
	
	for (int counter =0; counter <3; counter =counter +1 ) {
	     System.out.println( "Hello Gopal");
 	} 
	for (int a =1; a <= 12; a++ ) {
		  System.out.println(a);
	}
	 int i=0;  //Execute only once 
	 while (i<=11) {
	  System.out.println(i);
	  i ++; 
	 }	
	  

    	int j = 23 ;
    	do {
    		System.out.println(j);
    	   j++;
	 }while (j < 32); 

    	
    	
         for (int counter = 0; counter < 9; counter  = counter +1) {
  
         System.out.println( "Gopal tyagi");
         }
         
         
         int []  numbers = {1,2,3,4,5,6,7,8,9,10};
         for (int n : numbers) {
        	 System.out.println(n);
         }
         ArrayList<String>names = new ArrayList<String>();
         names.add("one");
         names.add("two");
         for (String n : names) {
        	 System.out.println(n);
         }
}
}
