package may19_Homework_Nicky;

import java.util.Scanner;

public class Task_11 {

	public static void main(String[] args) {
		
		/*Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
         */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pleses enter the word: ");
		
		String word = scan.next();
		
		if(word.startsWith("x")) {
			
			String word1 = word.substring(1);
			
			System.out.println(word1);
			
		}else {
			System.out.println(word);
		}
		
		
		scan.close();

	}

}
