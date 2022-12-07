package in.co.Basics;

public class Typecasting {
	
	public static void main(String[] args) {
	  
		
		//small to big datatype conversion
		//implicit type casting
		
		int i=4;
		System.out.println(i);  //i=4
		
		double d=i;
		System.out.println(d);  //d=4.0
		 
		int l =19;
        System.out.println(l);
        long m =67;
        System.out.println(m);

		
		//big to small datatype conversion
		//explicit type casting
		
		double d1=5;
		System.out.println(d1);  //d1=5.0
		
		int i1= (int) d1;
		System.out.println(i1);  // i1=5
		
		
    	float j=12;
        System.out.println(j);	//j=12.0
		
        double k=j;
        System.out.println(k);  //k=12.0
        
        
        long s=21;
        System.out.println(s);   //s=21
        float A=s;
        System.out.println(A);   //A=21.0
		
}
}
