package in.co.ConcurrencyAndThread;

public class TestHelloThread {
	public static void main(String[] args) {
		
		HelloThread t1 = new HelloThread("ram");
		HelloThread t2 = new HelloThread("gopal");
		
		t1.start();
		t2.start();
		
		/*
		 * for(int i=0;i<=5;i++) { System.out.println("main"); }
		 */
	}

}
