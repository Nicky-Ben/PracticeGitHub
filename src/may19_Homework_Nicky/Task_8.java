package may19_Homework_Nicky;

import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {
		
		/*write a program that asks the user enter a three letter word. Check if the middle
		character of the given word is 'a'. In the case it is print: "Cool word", but in the case
		the middle letter is not 'a' print: "Okay word".
		     - If the user does not enter a 3 letter word tell them:
		             If the word is less than 3 letters: "Word is too short"
		             If the word is too long: "Word is too long"
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please entet a three letter word");
		String word = scan.nextLine();
		
		String str = "";
		
		if(word.length() < 3) {
			str = "Word is too short";
			
		} else if (word.length()>3) {
			str = "Word is too long";
			
		} else {
			if (word.charAt(1)=='a') {
				str = "Cool word";
		}else	if (word.length()!= 'a') {
				str = "Okay word";
			}
		} 

			System.out.println(str);
			
			scan.close();
		
	}

}
