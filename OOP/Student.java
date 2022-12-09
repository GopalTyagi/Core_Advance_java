package in.co.OOP;

public class Student implements Cloneable {
	int rollno;
	String name ;
	
	Student(int rollno,String name){
		this.rollno =rollno;
		this.name = name;
	}
	
	public Object clone ()throws CloneNotSupportedException {
		return super.clone() ;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1 = new Student (101,"Amit");
		Student s2 = (Student)s1.clone();
		Student s3 = new Student (102 , "john");
		Student s4 = (Student)s3.clone();
		
		
//		System.out.println(s3.rollno + " " + s3.name);
		System.out.println(s4.rollno + " " + s4.name);
 //       System.out.println(s1.rollno + " " + s1.name);
        System.out.println(s2.rollno + " " + s2.name);
		
	}
	

}
