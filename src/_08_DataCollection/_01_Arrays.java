package _08_DataCollection;

public class _01_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TODO learn to write Arrays
		//TODO: Create and print out 3 different arrays about any topic.
		int [] anArray;
		
		anArray = new int [10];
		 // initialize first element 0 is to be the first element always!
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
        
        String [] anArrayOfStrings;
        anArrayOfStrings = new String [3];
        anArrayOfStrings[0] = "Drixtel";
        anArrayOfStrings[1] = "Kallen";
        anArrayOfStrings[2] = "DragKel";
		System.out.println(anArrayOfStrings[0]);
		System.out.println(anArrayOfStrings[1]);
		System.out.println(anArrayOfStrings[2]);
		
	}

}
