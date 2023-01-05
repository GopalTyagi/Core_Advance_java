package in.co.ConcurrencyAndThread;

public class TestHelloRunnable {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new HelloRunnable(" gopal"));
		Thread t2 = new Thread(new HelloRunnable(" rohit"));
		
		t1.start();
		t2.start();
		
	}
}
