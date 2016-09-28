package _15_Inheritance_Polymorphism;

public class Animal {
	
	//Properties
	public int numLegs;
	public int numTeeth;
	public int numEyes;
	public int lifespan;
	
	public String name;
	public String habitat;
	
	
	public boolean isWarmBloded;
	
	//Methods
	public void getAnimalInfo(){
		System.out.println(name +" lives in Habitat "+habitat + " They live on average for " + lifespan + " Years");
	}
	
	public void speak() {
		System.out.println("I am an Animal!");
	}
	
	public void HabitatLove(){
		System.out.println("I love my "+ habitat);
	}
	

}
