package day08comtrol_flow;

import java.util.Scanner;

public class CalculatorwithScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number A");
		double numA = scan.nextDouble();
	
		System.out.println("Enter Numer B");
		double numB = scan.nextDouble();
		
		System.out.println("Type one of the follwing operators");
		System.out.println(" + , - , * , / ");
		String operator = scan.next();
		
		double total = 0;
		
		
		if (operator.equals("+")) {
			total = numA + numB;
		}
		
		if (operator == "_") {
			total = numA - numB;
		}
		
		if (operator == "*") {
			total = numA *numB;
		}
		
		if (operator == "/") {
			total = numA / numB;
		}	
		

		
		
		System.out.println(numA +" "+operator+" "+ numB +" = " + total);
		
         scan.close();
	}

}
