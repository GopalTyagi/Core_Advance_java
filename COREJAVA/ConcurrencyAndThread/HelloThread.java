package in.co.ConcurrencyAndThread;

public class HelloThread extends Thread{
	
	String name ;
	
	public HelloThread(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i + ":" + name);
		}
	}

}
