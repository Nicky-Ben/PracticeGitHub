package may13_ControlFlowHomework_Nicky;

import java.util.Scanner;

public class Task_6_MaximumNumber {
	
	/*
	 * Write a program that asks the user to enter a number for 5 times.
	 * return the maximum number.
	 * */

	public static void main(String[] args) {
		int i = 0;
		int fact = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number");
		i = scan.nextInt();
		
		while ( i <= 5) {
			System.out.println(i);
			
			i++;
			fact *= i; // fact = fact * i;
		}
		
		
	
		System.out.println("Maximum number is "+fact);
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
