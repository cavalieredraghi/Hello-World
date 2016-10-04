package _16_Interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DVD serenity = new DVD();
		CD meteora = new CD();
		
		meteora.play();
		serenity.play();
		meteora.menu();
		serenity.menu();
		
		CD hybridTheory = new CD ();
		hybridTheory.play();
		hybridTheory.stop();
		
		Bluray avengers = new Bluray();
		avengers.play();
		avengers.menu();
		
		meteora.getTitle("Linkin Park");
		avengers.getTitle("Avengers Age of Ultron");
		serenity.getTitle("I continue Firefly");
		
	}

}
