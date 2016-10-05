package _19_NewFriends;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend robert = new Friend("Robert", 22, "Best Friend");
		Friend mira = new Friend ("Mira", 27, "Girlfriend");
		
		mira.getAge();
		mira.getName();
		mira.getStatus();
		
		robert.getName();
		robert.getAge();
		robert.getStatus();
		
		if (robert.getName().equals(mira.getName())){
			System.out.println("check and set last names.");
		}else {
			System.out.println("They are not the same person");
		}
	}

}
