package _15_Inheritance_Polymorphism;

public class Kangaroo extends Animal{

	boolean isAMarsupial;
	
	@Override
	
	public void speak(){
		System.out.println("Hip hop hipity Hop!");
	}
	public void HabitatLove(){
		System.out.println("I love the dry hot sun in " + habitat);
	}
}
