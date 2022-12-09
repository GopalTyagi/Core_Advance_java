package in.co.OOP;

public class Employee implements Cloneable {
	
	public String name = "amit";
	public Employee (String name) {
		super();
		this.name = name ;
	}
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
	/*
	 * public static void main(String[] args) throws CloneNotSupportedException {
	 * 
	 * Employee e1 = new Employee ("amit"); Employee e2 = (Employee) e1.Clone();
	 * 
	 * System.out.println(e1.name); System.out.println(e2.name);
	 * 
	 * }
	 */

}

