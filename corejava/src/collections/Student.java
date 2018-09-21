package collections;
import java.util.*;
public class Student {
	int rollno;
    String name;
    Student(int rollno,String name){
    	this.rollno=rollno;
    	this.name=name;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1111,"Sushmita");
		Student s2 = new Student(2222,"Revathi");
		Student s3 = new Student(3333,"Lalitha");
		
		ArrayList<Student>student = new ArrayList<Student>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		
		Iterator itr= student.iterator();
		while(itr.hasNext()){
			Student st= (Student)itr.next();
			System.out.println(st.rollno+" "+st.name);
	}
	}
}
