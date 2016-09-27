package _08_DataCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_ArrayList {

	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList <String>();
		
		names.add("Anthony");
		names.add("Ethan");
		names.add("Shane");
		names.addAll(Arrays.asList("John", "Paul", "Sydeny"));
		System.out.println(names);
		
		//TODO - create an ArrayList of integers and add some numbers to it.
		
		ArrayList <Integer> nums = new ArrayList <Integer>();
		
		nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println(nums);
		
		
	}

}
