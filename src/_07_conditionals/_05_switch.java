package _07_conditionals;

import java.util.Scanner;

public class _05_switch {
	public static void main (String [] args){
		String mainCourse;
		String side;
		String dessert;
		Scanner inputInfo = new Scanner (System.in);
		System.out.println("Welcome to Cav Shack, would you like Hamburger, Pizza, or Burrito?");
		mainCourse = inputInfo.nextLine();
		
		switch (mainCourse){
			case "Hamburger": mainCourse = "burger";
				break;
			case "Pizza": mainCourse = "Piz";
				break;
			case "Burrito": mainCourse ="Buro";
				break;	
		}
		System.out.println("you have chosen "+ mainCourse+ " Please pick a side. Rice and Beans, fries, or bread Sticks.");
		side = inputInfo.nextLine();
		switch (side){
			case "Rice and Beans": side = "Rice and Beans";
				break;
			case "Fries": side = "Fries";
				break;
			case "Bread Sticks": side = "Bread Sticks";
				break;
		}
		System.out.println("you have chosen "+ side+ " please pick a dessert: Ice Cream, Brownies, or Horchata.");
		dessert = inputInfo.nextLine();
		
			switch(dessert){
			case "Ice Cream": dessert = "Ice Cream";
				break;
			case "Brownies": dessert = "Brownies";
				break;
			case "Horchata": dessert = "Horchata";
				break;
			} System.out.println("You order is:" +" "+ mainCourse +" "+ side +" "+ dessert +" Enjoy!");	
			inputInfo.close();
	}
}
