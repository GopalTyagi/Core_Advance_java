package in.co.OOP;

public class Customer implements Cloneable {
	
	public String name = null ;
	public BankAccount Account = null;
	
	public void customer (String n) {
		name = n;
		Account = new BankAccount (5400);
	}
	public Object clone ()throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.Account = (BankAccount)Account.clone ();
		return c ;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
	
	/*	Customer c1 = new Customer ("abc");
		Customer c2 = (Customer)c1.clone();
		
		System.out.println(c2.name);
		System.out.println(c2.Account.balance);
		
		c2.name = "abc";
		c2.Account.balance = 65000;
		
		//original
		
		System.out.println("Name" + c1.name);
		System.out.println("Balance" + c1.Account.balance);
		
		//After cloning 
		
		System.out.println("Name" + c2.name);
		System.out.println("Balance" + c2.Account.balance);
	}     
	
	*/
	}
}
