package in.co.OOP;

//Bean class - private attributes and public getter/setter methods

 public class Encapsulation {
	private String fname ;
	private String lname ;
	private int id ;
	private String dob;
	private String Address;
	private String Age ;
	 
	public void setFname(String fname) {  //Setter method //
		this.fname = fname;
	}
	public String getFname() {  //Getter method // 
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		this.Age = age;
	} 
 

	
	private String anumber ;
	private String atype ;
	private double balance ;
	private String color ;
	private String speed;
	private String brand;
	 
	public void setAnumber (String anumber) {
		this.anumber = anumber;
	}
	public String getAnumber () {
		return anumber;
	}
	public void setAtype (String Atype) {
		this.atype = Atype;
	}
	public String getAtype () {
		return atype ;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Double getBalance () {
		return balance;
	}	
	public void setColor (String color) {
		this.color = color ;
	}
	public String getColor () {
		return color ;
	}
	public void setSpeed (String speed) {
		this.speed = speed; 
	}
	public String getSpeed () {
		return speed;
	}
	public void setBrand (String brand) {
		this.brand = brand ;
	}
	public String getBrand () {
		return brand;
	
	
	}	
 }
