package in.co.OOP;

public class TestOverloading {
	public static void main(String[] args) {
		
		display (21);
		display (1,23);
		display ("hello","guys","i am ","gopal");
		display (1,34);
	}
    public static void display(int i ){
        System.out.println(i);
    }
    public static void display(int i , int j) {
    	System.out.println( i + ","  + j);
    }
    public static void display(String i,String j ,String k ,String l ) {
    	System.out.println(i + " " + j + " " +  k + l);
    }
   
    

}
