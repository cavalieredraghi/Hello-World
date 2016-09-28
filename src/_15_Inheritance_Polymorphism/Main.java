package _15_Inheritance_Polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Creating new animals
		Animal george=new Animal();
		george.name = "George the Animal";
		
		
		Bear Barney = new Bear();
		Barney.name = "Barney the bear";
		Barney.isHibernating = true;
		Barney.habitat = "Forest.";
		Barney.lifespan = 30;
	
		
		Kangaroo Jack = new Kangaroo();
		Jack.isAMarsupial = true;
		Jack.habitat = "Aussy Mate!";
		
		Mouse Squeaker = new Mouse();
		Squeaker.habitat = "your walls!";
		
		
		// creating new methods
		Barney.getAnimalInfo();
		Barney.speak();
		Jack.speak();
		Squeaker.speak();
		Squeaker.HabitatLove();
		Jack.HabitatLove();
		Barney.HabitatLove();
		
		//Challenge Create a Mouse class inside of this package. 
		//have a mouse class inhert from Animal
		//Make the Mouse class use Polymorphism to override speak()
		//within Animal create a new Method
		// Override it within Kangaroo mouse and bear to make it specific to that type of animal
		
	}

}
