package _03_numbers;
//a story using Primitive types
//written by Anthony Holt
public class my_story {
	public static void main(String[] args)
	{
		//Arokh is a paladin in a D&D game. He is a species known as Dragonborn.
		
		//he started off with this much HP
		int hp=20;
		//his weapon damage is
		int weaponDamage=12;
		//He also has a breath weapon like a dragon.
		int breathWeapon=25;
		// Arokh was sent on a quest to remove a raiding wolf pack from the area. 
		//After a half day of searching he found his first wolf.
		int wolfHealth=24;
		int wolfDamage=8;
		//Arokh attacked the wolf with his weapon.
		System.out.println(wolfHealth-weaponDamage);
		//The wolf took a nasty slash from Arokh's sword. 
		//It then lunged at Arokh with its snarling maw.
		System.out.println(hp-wolfDamage);
		//Arokh's armor did not protect him from the wolf's sharp fangs. 
		//Arokh then looked upon the wolf as he let loose is own snarl. 
		//Arokh opened his snout as he let loose a golden blast of fire upon the wolf.
		System.out.println(wolfHealth-breathWeapon<=0);
		//Arokh killed the wolf attacker as he stepped over its fiery carcass toward's it den. 
	}
}
