package in.co.OOP;

public class Department implements Cloneable{
	
	public String Hr = "Manager";
	public Department ( String Hr ) {
		super();
		this.Hr = Hr ;
	}
	public Object clone ()throws CloneNotSupportedException {
		return super.clone();		
	}
	/*
	 * public static void main(String[] args) throws CloneNotSupportedException {
	 * 
	 * Department d1 = new Department ("Manager"); Department d2 = (Department)
	 * d1.clone();
	 * 
	 * System.out.println(d1.Hr); System.out.println(d2.Hr);
	 * 
	 * 
	 * 
	 * }
	 */

}
