package _15_Inheritance_Polymorphism;

public class Mouse extends Animal{

	Boolean isSmall;
	
	@Override
		public void speak(){
		System.out.println("I am not a mouse of NYHM!");
	}
	public void HabitatLove(){
		System.out.println("I love the cheese being so close to "+habitat);
	
	}
}
