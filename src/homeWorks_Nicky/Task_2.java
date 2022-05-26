package homeWorks_Nicky;

import java.util.Scanner;

public class Task_2 {


	public static void main(String[] args) {
		/*
		 * Write a Java Program to print following message.
		 * Good Morning    5 < 12
		 * Good Afternoon 12 - 17 
		 * Good Evening   17 - 24
		 * 
		 */
		
		 Scanner sc = new Scanner(System.in); 
		 
		 System.out.println("Please enter a value betwwen 1-24");
		 

		int timeofday = sc.nextInt();
		 
		if (timeofday >= 1 && timeofday <= 24) {
		 
		 
		  
		 if (timeofday <= 5 && timeofday <= 12) {
			  System.out.println("Good Moring"); 
		 }
		  if (timeofday  >=12 && timeofday  <= 17) {
			  System.out.println("Good Afternoon"); 
		 }
		  if (timeofday  >=17 && timeofday  <= 24) {
			  System.out.println("Good Evening");
		 }
		 
		  else { System.out.println("Please enter an invalid number from 1 - 24");
			 
		  }
	
		
		}

		 
		sc.close();
	
	}
}
