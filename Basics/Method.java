package in.co.Basics;

public class Method {
	
public static void main(String[] args) {
	
	int n = 2;
	int m = 5;
	
	Method obj = new Method();  //creating object of Method class
	int value = obj.sum(n, m);  //method calling 
	System.out.println(value); 
}
	 
	//Instance method are methods which require an object of its class to be created before it can be called .
	
	public int sum(int a , int b) {
		return a+b;
		
	}
	


}
