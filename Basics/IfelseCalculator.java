package in.co.Basics;

public class IfelseCalculator {

	public static void main(String[] args) {


	int A = 12;
	int B = 11;
	if( A>B || A>B )
	{ 
		System.out.println("Addition is " + (A + B));   //Addition//
	}if(A>B  || A<B)
	{
		System.out.println("Substraction is " + (A - B));  //Substraction//
	}if ( A>B || A>B)
	{
		System.out.println("Multiplication is "+ (A*B));  //Multiplication//
	}if (A>B || A<B)
		
	{   System.out.println("Modulas is " +  (A%B));  //Modulas//
	}
	else System.out.println("inside else block");
}

}
