package day14_StringReview;

public class StringTask1 {

	public static void main(String[] args) {
		
	/*	## Task1
		`write a program that asks user to enter a sentence.
		                then print the first & last characters of the sentence
		Example:
		    Input: Welcome To TechCircle
       output: We
*/
	//	                012345678910
	//	 String name = "Welcome To TechCircle";
		 
	//	 System.out.println(name.charAt(0));
	//	 System.out.println(name.charAt(21));
		 
		 
		 
		 
		 
		 String input = "Welcome To TechCircle!";
	        
	        char firstChar = input.charAt(0);
	 //       char lastChar = input.charAt(21);
	        System.out.println(input.length());     //22
	        
	        char lastChar = input.charAt(input.length()-1);
	        
	        System.out.println(firstChar);   // W
	        System.out.println(lastChar);    // !
	        System.out.println();            // 
	        
	        String result = ""+firstChar;    
	        System.out.println(result);      // w
	        result += lastChar;
	        System.out.println(result);      // w!
	        
	        
	        
	        
	       System.out.println(input.charAt(22-1));    // !
		 
	}

}
