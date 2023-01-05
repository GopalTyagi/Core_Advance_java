package in.co.Generics;

public class TestData {
	public static void main(String[] args) {

		Data<Integer> i = new Data<Integer>(454);
		i.showType(); // Shows type
		int v = i.getValue(); // No typecast
		System.out.println("value :" + v);

		Data<String> str = new Data<String>("gopal");
		str.showType(); // Shows type
		String s = str.getValue(); // No typecast
		System.out.println("value : " + s);

	}

}
