package in.co.ExceptionHandling;

public class TryCatch {
public static void main(String[] args)throws Exception {
	    Exception t = new Exception();
	    int i= 200;
	    int j= 0;
	try {
		int value = i+j;
	}catch(Exception e) {
		System.out.println("catch block");
	}finally {
		System.out.println("finally block");
	}try {
		int val = i/j;
	}catch(Exception e) {
		System.out.println("catch block");
	}finally {
		System.out.println("finally block");
		
	}
}
}
