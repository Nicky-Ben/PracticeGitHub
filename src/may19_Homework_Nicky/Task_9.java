package may19_Homework_Nicky;

import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {
	
		/*Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
       */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter two word");
		
		String word1 = scan.next();
		
		String word2 = scan.next();
		
		String wordOutput1 = word1.substring(1);
		
		String wordOutput2 = word2.substring(1);
		
		System.out.println(wordOutput1.concat(wordOutput2));
		
		
		scan.close();
		
		
	}

}
