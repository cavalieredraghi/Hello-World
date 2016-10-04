package _07_conditionals;


public class _01_ifs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// remember if else are for true false type statements get use to switch type statement for most everything else.
System.out.println("This class is to work on if and if else statements.");
for(int i =0; i<=50;i++){
		if (i>0){
		if (i % 3 + i % 5 == 0 ){
			System.out.println("Fizz Buzz "+i);
			continue;
		}
			else if (i%3==0){
				System.out.println("Fizz " +i);
				}else if ( i % 5==0){
					System.out.println("Buzz "+i);
				}else{
					continue;
				}
	}
	}
}
}

