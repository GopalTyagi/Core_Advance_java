package in.co.OOP;

public class TestCons {
	public static void main(String[] args) {
		
		ConsA q = new ConsA ("Google","Sundar pichai",2000,"IT") ;
		
		String a = q.getCompany();
		System.out.println(a);
		String b = q.getCeo();
		System.out.println(b);
		String c = q.getSegment();
		System.out.println(c);
		int  d = q.getNetworth();
		System.out.println(d);
		
		
		
			
		
	}

}
