package in.co.OOP;

public class PersonAccount {
	public static void main(String[] args) {
		Encapsulation en = new Encapsulation () ;
		
		en.setFname("Gopal");
		en.setDob("09/09/2002");
		en.setAddress("indore");
		en.setAge("12");
	 	
		System.out.println(en.getFname());
		System.out.println(en.getDob());
		System.out.println(en.getAddress());
		System.out.println(en.getAge());
		
		

	    en.setAnumber("301324434937");
	    en.setAtype("saving account");
	    en.setBalance(300000.1); 
	 
	    
	    System.out.println(en.getAnumber());
	    System.out.println(en.getAtype());
	    System.out.println(en.getBalance());
	    
	    
	    en.setBrand("duster");
		en.setColor("black");
		en.setSpeed("250"); 
		
		
		System.out.println(en.getBrand());
		System.out.println(en.getColor());
		System.out.println(en.getSpeed());
	}


}
