package _06_inputoutput;

import java.util.Scanner;

public class _01_user_input {
	public static void main(String[]args){
		// Scanner is a java class- used for User input
		Scanner inputInfo = new Scanner (System.in);
		String name;
		String birthCity;
		String age;
//		 Setup a simple user input
		System.out.println("Enter your name below: ");
		name = inputInfo.next();
		System.out.println(name);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter some text: ");
		String str = sc.nextLine();
		
		System.out.println("Enter your City below: ");
		birthCity = inputInfo.next();
		System.out.println( birthCity);
		
		System.out.println("Enter your age below: ");
		age = inputInfo.next();
		System.out.println(age);
		
//		 use a cancatenation to make a sentence using these inputs
//		 .next just takes the first word, while .nextLine takes the whole line till user hits enter
		System.out.println("Name:");
		name = inputInfo.nextLine();
		
		System.out.println("Birth City:");
		birthCity = inputInfo.nextLine();
		
		System.out.println("Age:");
		age = inputInfo.nextLine();
		
		
		System.out.println("Hello "+ name + ".  You were born in " + birthCity + ".  You are "+ age + " years old.");
		inputInfo.close();
		// .close use this to keep from allowing the program to use more and more memory.
	}
}
