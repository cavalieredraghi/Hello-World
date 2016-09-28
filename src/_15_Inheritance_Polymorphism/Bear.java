package _15_Inheritance_Polymorphism;

public class Bear extends Animal{
	public boolean isHibernating;
	
	@Override
	public void speak(){
		System.out.println("RRRRRRRRROOOOOOOOOOOOOAAAAAAAAAARRRRRRRRRRRRRR!");	
	}
	public void HabitatLove(){
		System.out.println("I love the leaves and rivers in my "+ habitat);
	}
}
