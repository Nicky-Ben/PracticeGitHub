package may19_Homework_Nicky;

import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {
		
		/*ask the user to enter a word. if the word ends with "ly", print "really???" ,
		 *  otherwise, print "never mind"*/
		
		
 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the word: ");
		String word = scan.next();
		
		if(word.endsWith("ly")) {
			System.out.println("Really???");
			
		}else {
			System.out.println("Never mind");
		}
		
		scan.close();
	}
	
}