package day_4rdReview;

import java.util.Scanner;

public class Ark1to100 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int input;
		while (true) {
			System.out.println("enter number between 1-100: ");
			input = scan.nextInt();
			 if (input > 0 && input <= 100) break;
	         System.out.println("Number is not in 1-100 range");
	      }
	      System.out.println(input);
		
		
          scan.close();


	}

}
