package day7_2ndReview.operators;

public class Main_TaskG {

	public static void main(String[] args) {
		
		// given integer 'n'
		int n = 8;
		// if n is odd
		
		if (n % 2 != 0) {
			System.out.println("Weird");
		}
         // if n is even and in the inclusive range of 2 to 5, print not Weird
		 // 2 3 4 5
		
		if (n >= 2 && n <= 5) { // inclusive range of 2 to 5;
		   System.out.println("Not Weird");
		}
		else if ( n<= 20) { // inclusive range of 6 to 20;
			System.out.println("Weird");
		}
		else   // greater than 20
			System.out.println("Not Weird");
		
		
		// 2 3 4 5
		if (n >=2 && n<= 5) 
			// 6 7 ... 20
			
		if ( n <= 20);
		
		
		
		
	}
		

}
