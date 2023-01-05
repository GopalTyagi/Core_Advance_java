package in.co.ConcurrencyAndThread;

public class prioritythread extends Thread{

	public prioritythread(String name) {
		super(name);
	}
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(getName() + " " + getPriority());
		}
	}
}
