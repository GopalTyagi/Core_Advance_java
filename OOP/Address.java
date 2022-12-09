package in.co.OOP;

public class Address implements Cloneable {

	public String permanent = "Indore";
	public String local = "Bhopal";
	public Address(String permanent , String local) {
		super();
		this.permanent = permanent;
	}
	public Object Clone() throws CloneNotSupportedException{
		return super.clone();
	}
	/*
	 * public static void main(String[] args) throws CloneNotSupportedException {
	 * 
	 * Address a1 = new Address ("Indore" , "Bhopal"); Address a2 =
	 * (Address)a1.Clone();
	 * 
	 * System.out.println(a1.permanent); System.out.println(a1.local);
	 * System.out.println(a2.permanent); System.out.println(a2.local); }
	 */

	

}
