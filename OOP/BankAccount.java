package in.co.OOP;

public class BankAccount implements Cloneable {
        //Shallow Clonning
	
	public double balance = 0;
	public BankAccount (double balance) {
		super ();
		this.balance = balance;
	}
	public Object clone () throws CloneNotSupportedException {
		return super.clone();
	}
	//public object clone () throws CloneNotSupportedException {
		//return super.clone();
	//}
	public static void main(String[] args) throws CloneNotSupportedException {
		 BankAccount b1 = new BankAccount (50000);
		 BankAccount b2 = (BankAccount)b1.clone();
		 
		 b2.balance = 7000;
		 
		 System.out.println(b1.balance);
		 System.out.println(b2.balance);
	}
	
}
