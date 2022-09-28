package ben.demo.Assignment1Day7;

import ben.demo.Assignment1Day7.StudentList;
import ben.demo.Assignment1Day7.Student;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentMain {
	
	public static void main(String args[]) {
	
		StudentList studentList = new StudentList();
		
		Student s = new Student(1, 123, "bob");
		studentList.add(s);
		
		Student s1 = new Student(2, 1123, "jim");
		studentList.add(s1);
		
		Student s2 = new Student(3, 1324, "nick");
		studentList.add(s2);
		
		studentList.getAllStudents();
		
	}
}
