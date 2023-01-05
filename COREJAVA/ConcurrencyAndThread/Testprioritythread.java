package in.co.ConcurrencyAndThread;

public class Testprioritythread {
  
	public static void main(String[] args) {
		
		prioritythread t1 = new prioritythread("thread A");
		prioritythread t2 = new prioritythread("thread B");
		prioritythread t3 = new prioritythread("thread C");
		prioritythread t4 = new prioritythread("thread D");
		
		t1.setPriority(5);
		t2.setPriority(10);
		t3.setPriority(3);
		t4.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		 
	}
}
