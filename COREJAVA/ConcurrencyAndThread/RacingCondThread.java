package in.co.ConcurrencyAndThread;

public class RacingCondThread extends Thread{
	public static Account data = new Account();
	
	public RacingCondThread(String name) {
		super(name);
	}

	public void run() {
		for(int i=0; i<5; i++) {
			data.deposit(getName(), 1000);
		}
	}
	
	public static void main(String[] args) {
		
		RacingCondThread u1 = new RacingCondThread("ram");
		RacingCondThread u2 = new RacingCondThread("radhika");
		
		u1.start();
		u2.start();
		System.out.println("Done");
	}
}
