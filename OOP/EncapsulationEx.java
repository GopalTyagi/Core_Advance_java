 package in.co.OOP;

public class EncapsulationEx {
	public static void main(String[] args) {
		
		Encapsulation en = new Encapsulation();
		en.setFname("ram");
		en.setLname("tyagi");
		en.setId (341);
		 
		
		
		System.out.println(en.getFname());
		System.out.println(en.getLname());
		System.out.println(en.getId());
		
		
		en.setFname("gopal");
		en.setLname("tyagi");
		en.setId(215);
		
		System.out.println(en.getFname());
		System.out.println(en.getLname());
		System.out.println(en.getId());
		 
		
		
		en.setBrand("Creta");
		en.setColor("black");
		en.setSpeed("300");
		
		System.out.println(en.getBrand());
		System.out.println(en.getColor());
		System.out.println(en.getSpeed());
		
	}

}
