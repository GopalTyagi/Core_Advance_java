package in.co.ConcurrencyAndThread;

public class Account {

	private int balance;

	public synchronized void deposit(String msg, int amt) {

		int bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg + " new balance " + bal);
	}

	private void setBalance(int balance) {
		databaseDelay();
		this.balance = balance;
	}

	private int getBalance() {
		databaseDelay();
		return balance ;
	}

	private void databaseDelay() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

		}
		this.balance = balance;
	}
}
