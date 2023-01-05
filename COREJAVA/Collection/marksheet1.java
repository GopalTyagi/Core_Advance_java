package in.co.Collection;

public class marksheet1 implements Comparable <marksheet1>{
    private String name;
    private String rollno;
    private String subjects;
    private int marks;
    
    public marksheet1 (String name,String rollno, String subjects, int marks) {
    	this.name = name;
    	this.rollno = rollno;
    	this.subjects = subjects;
    	this.marks = marks;
    }
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "marksheet1 [name= " +name  + ",rollno= "+ rollno + " ,subjects= "+ subjects + ",marks= " +marks + "]";
	}


	@Override
	public int compareTo(marksheet1 o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	

}
