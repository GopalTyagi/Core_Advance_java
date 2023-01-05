package in.co.Basics;

public class Arrays {
	public static void main(String[] args) {
		int [] arr1 = new int [4];   //Collection of similar type of element that has 
		arr1 [0] = 1;                //contiguous memory locations
		arr1 [1] = 2;
		arr1 [2] = 3;
		arr1 [3] = 4;
 		
		//   int[] arr = {1,2,3,4};
		int element = arr1[1];
		System.out.println("Element at 1st index is " + element );
	    int size = arr1.length ;
	    System.out.println("Size of the defined array is " + size );
	    
	    
	    char [] copyForm = { 'S','U','N','R','A','Y','S'};
	    char [] copyTo = new char [4];
	    System.arraycopy(copyForm,3,copyTo,0,4);
	    System.out.println(copyForm);
	    System.out.println(copyTo);
	    
	    for (int i=0; i<4; i++) {
	    	System.out.println(arr1[i]);
	    }
	   for (char c : copyTo) {
		   System.out.println(c); 
	   }
	   
/*	    //2D Array//
	   int [][] arr = { { 1,2} , {3,4} };
	   
	   for (int i=0; i<2; i++) {
	   for (int j=0; j<2; j++) {
	   System.out.println("arr [" + i + "][" + j + "]" + arr[i][j]);   
	   }
	   }
	   
	   
/*	   int [][] table = {{1,2},{3,4},{5,6}};
	   
	   for (int[]row : table) {
		   for (int n:row) {
			   if (n%2 == 0) {
				   System.out.println(n);
				   
			   }
		   }
	   }
*/	   
	   }
	   }
