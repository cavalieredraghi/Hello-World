package _19_NewFriends;

public class Friend {

	private String name;
	private int age;
	private String status;
	
	//constructor
	
	public Friend(String name, int age, String status){
		this.name=name;
		this.age=age;
		this.status=status;
	}
	
	//getters
	
	public String getName(){
		System.out.println(name);
		return name;
	}
	public int getAge(){
		System.out.println(age);
		return age;
	}
	
	public String getStatus(){
		System.out.println(status);
		return status;
	}
}
