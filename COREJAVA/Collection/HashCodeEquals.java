  package in.co.Collection;

public class HashCodeEquals implements Comparable<HashCodeEquals> {
	public String name;
	public String rollno;
	public int marks;

	public HashCodeEquals(String name, String rollno, int marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollno + " " + name + " " + marks;
	}

	@Override
	public boolean equals(Object o) {

		if (o == null)
			return false;
		if (!(o instanceof HashCodeEquals))
			return false;

		HashCodeEquals other = (HashCodeEquals) o;
		return this.rollno.equals(other.rollno);
	}

	@Override
	public int compareTo(HashCodeEquals o) {
		// TODO Auto-generated method stub
		return rollno.compareTo(o.rollno);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return rollno.hashCode();
	}

}
