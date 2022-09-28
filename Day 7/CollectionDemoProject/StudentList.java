package ben.demo.Assignment1Day7;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StudentList {
	private Set<Student> students = new LinkedHashSet();
	
	public boolean add(Student student) {
		return students.add(student);
	}
	
	// Status if the removal or addition is successful or not
	// Benefit is that once you're done, you can check if added / removed or not
	public boolean remove(Student student) {
		return students.remove(student);
	}
	
	public void getAllStudents() {
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
