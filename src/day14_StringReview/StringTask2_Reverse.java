package day14_StringReview;

public class StringTask2_Reverse {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Create a class called Reverse, write a program that will reverse a string.
    Your program should reverse a string only 5 characters long.
    If word is shorter, display message: "Too short!".
    If word is longer, display message: "Too long!".
    Otherwise, reverse this word and print out result into the console.*/
		
		
	//	String Word1 = "Too ";
	//	String Word2 = "short";
	//	String Word3 = "long";
		
	//	String result1 = Word1 + Word2;
	//	System.out.println(result1);
				
	//	String result2 = Word1 + Word3;
	//	System.out.println(result2);
		
		
		String str = "Pizza";
		
		if (str.length()==5) {
			// reverse your string
//			System.out.println(str.charAt(4));
//			System.out.println(str.charAt(3));
//			System.out.println(str.charAt(2));
//			System.out.println(str.charAt(1));
//			System.out.println(str.charAt(0));
			
			for (int i = str.length()-1; i >=0 ; i--) {
//              System.out.println(i);
              System.out.print(str.charAt(i));            // azzip
          
			}
			
		}else if (str.length() > 5) {
			System.out.println("Too long!");
			
		}else {
			System.out.println("Too short");
		}
		
		
		

	}

}
