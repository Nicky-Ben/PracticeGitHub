package day06_controlFlow;

public class OmitingElsePart {

	public static void main(String[] args) {
		
		//Decision making statements 
        // if statement And switch case
         //Syntax:
        /*
         * if (condition){
         *         statement1
         * }else{
         *         statement2
         * }
         * 
        */
        
		int a = 5;
		
		if (a % 2 == 1) {
			System.out.println(a +" is odd number");
		}
		
		if (a % 2 == 0) {
			System.out.println(a + " is even number");
		}
		
		
		System.out.println("Line #29");
		
		
		int n1 = 300;
		int n2 = 300;
		
		if (n1 > n2) {
			System.out.println("Max number is "+n1);
			System.out.println("Min number is "+n2);
		}
		
		
		if (n1< n2) {
			System.out.println("Max number is "+n2);
			System.out.println("Min number is "+n1);
		}
		if (n1 == n2) { 
			System.out.println("They are equal");
		}
 
	}

}
