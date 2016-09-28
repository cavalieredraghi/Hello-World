package _13_Friends;

public class Friends {

	String firstName;
	String lastName;
	int age;
	String Status;
	String yearsKnown;
	String currCity;
	String homeTown;
	boolean female;
	String gender;
	
	
	
	public void getfriend(){
		System.out.println(firstName +" "+ lastName +" Age:" + age + " Status:" +Status);
	}
	
//	public void printYearsKnown(){
//		switch (yearsKnown){
//		case "10" : yearsKnown = "You have known " + firstName+ " for 10 years";
//			break;
//		case "5" : yearsKnown = "You have known " + firstName+ " for 5 years";
//			break;
//		case "15" : yearsKnown = "You have known " + firstName+ " for 15 years";
//			break; 
//		}
//		System.out.println(yearsKnown);
		
		public void getHometown() {
		if (currCity != homeTown){
			System.out.println(firstName + " has moved away from home.");
		}else if (female != true) { gender="he";
		}else{gender="she";
		}
			
			System.out.println (firstName +", " + gender + " is living in their hometown.");
			
		}
	}


