package _04_Strings;

public class _02_challenges {
	public static void main(String[] args)
	{/*
		//Bronze
		String firstName = "Anthony";
		String middleName = " Wilson ";
		String lastName = "Holt";
		System.out.println(firstName+middleName+lastName);
		//silver
		//String sodaCan = "Soda Can";
		//System.out.println(sodaCan.substring(0, 5));
		//System.out.println(sodaCan.substring(5));
		//gold
		 *  Create a string containing the phrase "sally sells seashells", and using a loop
		 *  (Will learn later so you might have to come back) 
		 *  count how many times the letter 's' appears in the phrase.
		*/
		
		String s ="sally sells seashells by the seashore.";
		int numS=0;
//		System.out.println(s.length());
//		System.out.println(s.charAt(20));
		for(int i=0;i< s.length(); i++){
			if(s.charAt(i) != 's'){
				continue;
			}else{ 
				numS++;
			}
			
		}
		System.out.println("There are "+ numS +" s's in your String.");
		
	}
}

