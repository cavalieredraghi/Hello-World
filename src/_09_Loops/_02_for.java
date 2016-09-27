package _09_Loops;

public class _02_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(initialize lcv(loop control variable); relation test; modifier)
//		for(int i=0;i<=10;i++){
//			System.out.println(i);
//		}
//		//TODO create a for loop that increments by 5 and counts 0-100 by 5
//		for (int i=0;i<=100;i=i+5){
//			System.out.println(i);
//		}
		int sum = 0;
		for (int i=0;i<=10;i++){
			sum=sum+i;
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
