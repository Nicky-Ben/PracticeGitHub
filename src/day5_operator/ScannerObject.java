package day5_operator;

import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args) {
		
		
		//Create instance of scanner object
		
		
		Scanner s = new Scanner(System.in);
		
		
	    System.out.println("Plese type number A");
		// int a = 20;		
		int a = s.nextInt();
		
		System.out.println("Plese type number B");
		// int b = 20;
		int b = s.nextInt();
		
		int result = a + b;
		
		System.out.println(result);

		//System.out.println("What'S Your name?");
		
		//String name = s.nextLine();
				
		//System.out.println("Hello"+name);
		

		s.close();
		

	}

}
