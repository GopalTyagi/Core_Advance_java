package in.co.ExceptionHandling;

public class ExceptionHandling {
	public static void main(String[] args) {

		int i = 0;
		int j = 15;

		try {
			int value = j / i;
			System.out.println(value);
		} catch (Exception e) {
			// TODO : handle exception

			System.out.println("Divided by Zero");
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally  block");
		}

		String name = "Vijay";
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String length is small");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Null data or empty data");
			e.printStackTrace();
		} finally {
			System.out.println("finally block");
		}

	}

}
