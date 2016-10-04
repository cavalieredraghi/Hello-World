package _09_Loops;

public class _03_foreach {
	public static void main(String[]arg){
		String [] comedians = {"Gabriel Iglesias", "Jeff Dunham", "Larry the Cable Guy", "Bill Engval"};
		for(String comedian:comedians){
			System.out.println(comedian);
		}
		String [] greastestBosses = {"Tammy-jo Anders", "Deanna" , "Mellisa McCartney"};
		
		for(String greastestBoss:greastestBosses){
			System.out.println(greastestBoss);
		}
//regular for statement with arrays
		String[] holidays = {"Yule", "Samhain", "Beltane", "Lamas"};
	  	
	  	for (int i=0; i< holidays.length;i++){
	  		System.out.println(holidays[i]);
	  		// Don't forget hat [i]s
	  	}
}
}
