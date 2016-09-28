package _14_Inheritance_Employee;

public class Employee_Class {
	//Properties
	private String name;
	protected double salary;
	
	
	//Constructors
	//A Contructor is a method that has the same name as a Class itself - it builds
	// our instances or objects of that class type
	Employee_Class(String name, double salary) {
		this.name = name;
		this.salary = salary;
		
	}
}
