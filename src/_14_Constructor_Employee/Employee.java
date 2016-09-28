package _14_Constructor_Employee;

public class Employee {
	//Properties
	String name;
	protected double salary;
	
	
	//Constructors
	//A Contructor is a method that has the same name as a Class itself - it builds
	// our instances or objects of that class type
	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		
	}
	
	JobTasks(){
		System.out.println();
	}
}
