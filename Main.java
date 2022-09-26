package EmployeeAssignmentDay5;

import java.util.ArrayList;

public class Main {

	public static void main(String args[]) {
		
		ArrayList<Employee> employeeList= new ArrayList<>();
		//System.out.println("E Size: "+employeeList.size());

		new Employee("Pheobe", 37, employeeList);			
		new Employee("Pheobe", 20, employeeList);
		new Employee("Joey", 6, employeeList);	
		new Employee("Monica", 69, employeeList);
		new Employee("Rachel", -1, employeeList);
		new Employee("Chandler", 25, employeeList);
		
		//System.out.println("E Size: "+employeeList.size());

	}
}
