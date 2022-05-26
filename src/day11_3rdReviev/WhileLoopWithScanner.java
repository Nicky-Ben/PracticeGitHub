package day11_3rdReviev;

import java.util.Scanner;

public class WhileLoopWithScanner {

	public static void main(String[] args) {
		
		// input = scanner.next();
		// System.out.println(input);
		
		// buy = "buy something"
		// sell = "sell something"
		// quit = "quit program"
		Scanner scanner = new Scanner(System.in);	
				
		String input = " ";
		while (!input.equals("quit")) {
			input = scanner.next();
			 switch (input) {
	            case "buy":
	               System.out.println("Buy something");
	               break;
	            case "sell":
	               System.out.println("Selling things");
	               break;
	            case "quit":
	               break;
	            default:
	               System.out.println("Invalid command. Try again");
	         }
	      }
			
		
		
		
		
		
					
	}

}
