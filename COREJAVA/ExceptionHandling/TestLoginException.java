package in.co.ExceptionHandling;

public class TestLoginException {
	public static void main(String[] args) throws LoginException {

		TestLoginException t = new TestLoginException();

		try {
			t.authenticate("raj");
			System.out.println("No exception found");
		}
		catch (LoginException e) {
			System.out.println("User Access Denied");
		} finally {
			System.out.println("This is Finally Block");
		}
	}

	public void authenticate(String name) throws LoginException {

		if (!"ram".equals(name)) {
			LoginException e = new LoginException();
			throw e;
		}

	}
}