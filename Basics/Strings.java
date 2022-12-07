package in.co.Basics;

public class Strings {
	public static void main(String[] args) {
		
		String s ="Gopal sharma tyagi ";   //Set of Characters // sequence of characters
	
		System.out.println(s.length());
		System.out.println(s.charAt (7));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.substring(6));
        System.out.println(s.lastIndexOf("t"));
        System.out.println(s.replace("ji", "go"));
        System.out.println(s.replaceAll("g", "l"));
        
        String s1 ="Ram";  //String literal pool// also called String constant pool//
        String s2 = "Ram";   
        
        String s3 = new String("Ram"); //Heap Memory//
        String s4 = new String("Ram");
        
        boolean result1 = (s1==s2);  //checks reference
        System.out.println("\n"  + result1);
        boolean result2 = (s1.equals(s2));  //check value
        System.out.println("\n" + result2);
        boolean result3 = (s3==s4);  //check reference
        System.out.println("\n" + result3);
	    boolean result4 = (s3.equals(s4));  //check value
	    System.out.println("\n" + result4);
	    
	}
	
	
	

}
