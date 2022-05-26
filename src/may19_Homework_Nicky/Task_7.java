package may19_Homework_Nicky;

import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {
		
		/*Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itsel 
        */
		
	//	String str1 = "";
		
	
	//	System.out.println(str1.startsWith(""));
		
	//	System.out.println("string is empty");
		
	//	String str2 = "itself";
		
	//	System.out.println(str2.substring(3));
		
//		System.out.println(str2.substring(0,5));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		
		String name = "";
		
		String str = scan.nextLine();
		
		if(str.length()==0) {
			name = "String is empty";
			
		}else if(str.length() > 3) {
			
			name = str.substring(str.length()-3);
		
		System.out.println(str.substring(str.length()-3));
		
	
		scan.close();
		
		}

	}
	

}
