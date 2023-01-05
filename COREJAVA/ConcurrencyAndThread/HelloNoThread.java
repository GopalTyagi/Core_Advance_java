package in.co.ConcurrencyAndThread;

public class HelloNoThread {
	
	String name ;
	
	public HelloNoThread(String n) {
		this.name = n;
	}
	
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i +  ":" + name);
		}
	}

}
