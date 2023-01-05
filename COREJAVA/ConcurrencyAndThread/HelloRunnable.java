package in.co.ConcurrencyAndThread;

public class HelloRunnable implements Runnable {

	public String name;
	
	public HelloRunnable (String name) {
		this.name = name;
	}

	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i + name);
		}
	}
}
