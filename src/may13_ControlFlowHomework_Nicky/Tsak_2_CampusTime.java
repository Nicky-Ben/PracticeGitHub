package may13_ControlFlowHomework_Nicky;

import java.util.Scanner;

public class Tsak_2_CampusTime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a time betwwen 1-24");
		
		int campusTime = scan.nextInt();
		
		if (campusTime >= 1 && campusTime <= 8) {
			System.out.println("close");
		}
		 
		if (campusTime >= 8 && campusTime <= 23) {
			System.out.println("open");
		}
		 
		if  (campusTime > 23 && campusTime >=24) {
			  System.out.println("close"); 
		 }
		
			
		
		scan.close();

	}

}
