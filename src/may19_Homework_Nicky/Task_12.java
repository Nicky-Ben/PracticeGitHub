package may19_Homework_Nicky;

import java.util.Scanner;

public class Task_12 {

	public static void main(String[] args) {
		/*Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter email");
		
		String email = scan.nextLine();
		
		String output = "";
		
		boolean  hasUnderscore = email.contains("_");
		boolean hasAt = email.contains("@");
		boolean hasDot = email.contains(".");
		
		int underScore = email.indexOf('_');
		int at = email.indexOf('@');
		int dot = email.indexOf('.');
		
		
		if(hasUnderscore && hasAt && hasDot) {
			
			if(underScore < at && at< dot) {
			
			String lastName = email.substring(underScore+1,at);
			String underSc = email.substring(underScore, underScore + 1);
			String firstName = email.substring(0,underScore);
			String domain = email.substring(at);
			
			 output = lastName.concat(underSc).concat(firstName).concat(domain);
			 
			 System.out.println(output);
		
		}else {
		} 
			output = "Invaid email";
			
			
			String str = "mike_tyson@gmail.com";
			str = str.replace('_','t');
			System.out.println(str);
			
			
				scan.close();
	    
	 }
	}
}
