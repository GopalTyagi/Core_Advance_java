package in.co.Collection;

public class TestHashCodeEquals {
	public static void main(String[] args) {

		HashCodeEquals H1 = new HashCodeEquals("sunny", "a2", 18);
		HashCodeEquals H2 = new HashCodeEquals("sania", "a1", 18);

		System.out.println(H1.hashCode());
		System.out.println(H2.hashCode());

		if (H1.hashCode() != H2.hashCode()) {

			if (H1.equals(H2)) {
				System.out.println("both are same");

			} else {
				System.out.println("both object not same");

			}
		
	}}
}
