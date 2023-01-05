package in.co.ExceptionHandling;

public class Exception01 {
	public static void main(String[] args) throws LoginException {
		
		Exception a = new Exception();
		int j= 20;
		int i =10;
		try {
			int value = j/i;
			System.out.println("try block");
		}catch (Exception e ){
			System.out.println("this is catch block");
		}finally {
			System.out.println("finally block");
		}
		
		/*public void authenticate(String name) throws LoginException {

			if (!"ram".equals(name)) {
				LoginException e = new LoginException();
				throw e;*/
			}	
	}


