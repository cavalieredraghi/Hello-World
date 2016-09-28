package _14_Constructor_Employee;

public class VP extends Manager{
	public String branch;

	VP(String name, double salary, String department, String branch) {
		super(name, salary, department);
		this.branch=branch;
		// TODO Auto-generated constructor stub
	}

}
