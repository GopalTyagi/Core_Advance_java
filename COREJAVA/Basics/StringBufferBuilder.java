 package in.co.Basics;

public class StringBufferBuilder {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer ("Hello");  //Synchronous,less efficient,thread safe,Multiusers system 
		System.out.println(sb);
 		sb.append("\n" + "it is string buffer");  
 		sb.append("\n" + "stringbuffer dot append is a method");
 		System.out.println(sb);
 		
 		StringBuilder sb1 = new StringBuilder ("gopal");  //Asynchronous,More efficient , not thread safe , Single users
	    System.out.println(sb1);
	    sb1.append("string builder ");
	    sb1.append("hello");
	    System.out.println(sb1);
	} 

}
