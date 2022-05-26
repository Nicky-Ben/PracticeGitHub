package day14_StringReview;

public class StringTask4 {
	
	public static void main(String[] args) { 
		
		/*## Task4
write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same*/
		
		 String str = "MammamiaMa";
	        
	        char first = str.charAt(0);
	        char last = str.charAt(str.length() - 1);
	        
	        if(first == last) {
	            System.out.println("Same");
	        }else {
	            System.out.println("Different");  // Different
	        }
		
		
		
	}

}
