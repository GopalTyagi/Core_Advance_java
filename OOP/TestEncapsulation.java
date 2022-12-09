package in.co.OOP;

public class TestEncapsulation {
	public static void main(String[] args) {
		
		Encapsulation a = new Encapsulation () ;
		
		a.setFname("Gopal");
		a.setLname("tyagi");
		a.setAge("32");
		a.setAddress("indore");
		a.setAnumber("303132345678");
		a.setAtype("savings");
		a.setBrand("koibhi");
		a.setColor("black");
		
		
		System.out.println(a.getFname());
		System.out.println(a.getLname());
		System.out.println(a.getAge());
		System.out.println(a.getAddress());
		System.out.println(a.getAnumber());
		System.out.println(a.getAtype());
		System.out.println(a.getBrand());
		System.out.println(a.getColor());
		
	}

}
