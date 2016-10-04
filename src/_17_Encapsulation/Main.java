package _17_Encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public is for all of the packages imported else where and what not.
		// private is for only that certain class to be able tobe used.
		//protected can only be used in the single package it was created in.
		//import allows even customized packages you have made else where.
		
		//create a patriots class
		// create three variables with different access levels
		//create a couple objects in the 15_Inheritance_Polymorphism package
		
		Patriots gWashington = new Patriots();
		gWashington.birthDate = 1732;
		System.out.println(gWashington.birthDate);
		gWashington.name = "Goerge Washington";
	}

}
