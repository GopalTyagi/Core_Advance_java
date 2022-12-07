package in.co.Basics;

public class LogicalAndOr {
	public static void main(String[] args) {
		  int c=13;
		   int d=14;
		   if ( c > 0 && d > 0 )  {
			   System.out.println("Logical AND" + "\n" );
			   
		   }else {
			   System.out.println("Default block" + "\n" );
		   }
			   
 		   
			int e=11;
			int f=22;
			if ( e > 0 || f < 0 ) {
				System.out.println( "Logical OR " + "\n" );
			}else {
				System.out.println("Default Block" + "\n" );
			}
	}

}
