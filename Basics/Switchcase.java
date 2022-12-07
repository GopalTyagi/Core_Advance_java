package in.co.Basics;

public class Switchcase {
	public static void main(String[] args) {
		
		int A =11;
		
		switch (A) {
		case 12:
			System.out.println("case 1 satisfied");
			break;
		case 11: 
			System.out.println("case 2 satisfied" + "\n");
		    break;
		case 13 : 
			System.out.println("case 3 satisfied");
		    break;
		default :
			System.out.println("This is default block");
		break;
		}
		
		 
		
		short B=32;
		
		switch (B)  {
		case 30:
			System.out.println("case 1 ");
			break;
		case 31:
			System.out.println("case 2");
			break;
		case 32:
			System.out.println("case 3" + "\n");
			break;
		default :
			System.out.println("this is default");
		}
		 
		
		int Q=34;
		
		switch (Q) {
		case 38:
			System.out.println("case1");
			break;
		case 37:
			System.out.println("case2");
			break;
		case 39:
			System.out.println("case3");
			break;
		default :
			System.out.println("default" + "\n");
		
		}
		
		int day = 1;
		String dayString = null;
		
		switch(day) {
		case 0:
			dayString = "sunday";
			break;
		case 1:
			dayString = "monday";
			break;
		default :
			dayString = "default";
			
		}System.out.println(dayString);
	
	}

}
