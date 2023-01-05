 package in.co.Collection;

public class MarkSheet implements Comparable <MarkSheet> {
	
	public String rollno ;
	public String name ;
	public int marks  ;
	
	public MarkSheet (String rollno, String name ,int marks) {
		this.rollno = rollno;
		this.name = name ;
		this.marks = marks ;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "MarkSheet [rollno=" + rollno + " , name=" + name + " , marks=" + marks + "]" ;
	}

	@Override
	public int compareTo(MarkSheet o) {
		// TODO Auto-generated method stub
		return rollno.compareTo(o.rollno);
	}

}
