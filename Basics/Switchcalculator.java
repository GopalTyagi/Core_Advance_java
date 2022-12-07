package in.co.Basics;

public class Switchcalculator {
public static void main(String[] args) {
	int A=12;
	int B=13;
	char c = 'e';	
	switch (c) {
	case 'A':
		System.out.println(A+B);
	break;
	case 'm':
		System.out.println(A*B);
	break;
	case 'e': 
		System.out.println(A-B);
	break;
	case 'f':
		System.out.println(A%B);
	break;
	
	default :
		System.out.println("this is default block");
	
	}
}	
	

}
