package _18_Encapsulation_Proper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player james = new Player("James", "null", 1);
		Player paul = new Player ("Paul", "null", 1);
		Player anthony = new Player("Anthony", "Godlike!", 100);
		
		System.out.println(james.getName());
		System.out.println(anthony.getName());
		System.out.println(anthony.getHP());
		
		james.setNewPlayerName("James Handshoe");
		System.out.println(james.getName());
		
		anthony.setNewPlayerStatus("Lord of all Video Games");
		System.out.println(anthony.getName()+ " "+ anthony.getStatus());
	}
	

}
