package day7_2ndReview.operators;

import java.util.Scanner;

public class Solution_A {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int numA = scanner.nextInt();
		int numB = scanner.nextInt();
		int numC = scanner.nextInt();
		System.out.printf( "%d %d %d ", numA,numB,numC);
		//numA > numB ==> numB > numC ==> print true
		System.out.println(numA > numB && numB > numC);
		
	    scanner.close(); // at the end
	}

}
