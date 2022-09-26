package EmployeeAssignmentDay5;

import java.util.ArrayList;

public class Employee {
	private String name;
	private int age;
	
	

	public Employee(String n, int a, ArrayList<Employee> employeeList) {
		this.name = n;
		this.age = a;		
		
		try {
			setName(employeeList, n);	
			setAge(employeeList, a);
			employeeList.add(this);
			System.out.println(n+ " has been added and they are "+a+" years old.");
			System.out.println();
						
		} catch (EmployeeNameException ahh) {
			//The error code here is the one on line 36 starting "throw new'.
			System.out.println(ahh.getErrorCode());
			System.out.println();
		} catch (EmployeeAgeException ohh) {
			System.out.println(ohh.getErrorCode());
			System.out.println();
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(ArrayList<Employee> employeeList, String nameInput) throws EmployeeNameException {
		for(Employee employee : employeeList) {
			if(employee.name == nameInput) {
				throw new EmployeeNameException("Employee already added with the name: '"+nameInput+"'");
			}
		}
		
		this.name = nameInput;
	}

	public int getAge() {
		return age;
	}

//	public void setAge(ArrayList<Employee> em, int a) throws EmployeeAgeException {
//		for(Employee employee : em) {
//			if(employee.age == a) {
//				throw new EmployeeAgeException("Employee's age is out of bounds.");
//			}
//		}
//		this.age = a;
//	}
	
	public void setAge(ArrayList<Employee> em, int a) throws EmployeeAgeException {
		if(a < 0) {
			throw new EmployeeAgeException("Dude, you have to be born.");
		} else if(a < 18) {
			throw new EmployeeAgeException("No minors allowed..");
		} else if(a > 60) {
			throw new EmployeeAgeException("Shouldn't you be in the grave??");
		}
		this.age = a;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	void checkBounds(int age) {
//		
//		try {
//			if(age < 18 || age > 60) {
//				System.out.println("Age is too young or to old.");
//			}			
//			return;
//		}
//		finally {
//			System.out.println("Age is within bounds - "+age+"!");
//		}
//	}
//
//	public static void main(String args[]) {
//		Employee me = new Employee();
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//
//		try {
////			System.out.println("Please enter your first name: ");
////			String firstName = scanner.toString();
//			
//			
//			System.out.println("Please enter your age between 18 and 60: ");
//			int age = scanner.nextInt();
//			
//			me.checkBounds(age);
//		}
//		catch(Exception exception) {
//			System.out.println("Either your name has already been entered, or your age is out of bounds.");
//		}
//	}
}
