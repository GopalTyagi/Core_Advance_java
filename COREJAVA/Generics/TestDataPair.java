package in.co.Generics;

public class TestDataPair {
	public static void main(String[] args) {
		
		DataPair<String,Integer> p1 = new DataPair<String,Integer>("goal",1000);
		p1.showType();
		String  s1 = p1.getKey();
		Integer s = p1.getValue();
		
		System.out.println(s + s1);
		
		DataPair<String,String> p2 = new DataPair<String,String>("India","no.1");
		p2.showType();
		String  q = p2.getKey();
		String q1 = p2.getValue();
		System.out.println(q + q1);
		
	}

}
