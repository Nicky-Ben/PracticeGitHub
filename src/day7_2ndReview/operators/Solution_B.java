package day7_2ndReview.operators;

import java.util.Scanner;

public class Solution_B {

	public static void main(String[] args) {
		
		
		/* String strA = scanner.nextLine();
      
            1 2 3 4
            ^
       
           String strB = scanner.next(); // 1
      
            1 2 3 4
              ^
       
           String strC = scanner.next(); // 2
      
            1 2 3 4
                ^
      
           System.out.println(strA);
           System.out.println(strB);
           System.out.println(strC);
		*/
	
	//	Scanner scanner = new Scanner(System.in);
	//	String input1 = scanner.next();
	//	int input2 = scanner.nextInt();
	//	int input3 = scanner.nextInt();
		
	//	int newint = input2= input3;
		
	//	System.out.println("My string is\"" +input1+"\"");
	//	System.out.println("The sum of the " + input2 + "and " + input3+"is"+newint);
		
		
	     

	//   scanner.close();
	    
	//   Scanner scanner = new Scanner (System.in);
	 //     String strA = scanner.nextLine();
	//      int numA = scanner.nextInt();
	   //   int numB = scanner.nextInt();
//
	 //     System.out.println("My string is " + strA);
	 //     System.out.println("The sum of the " + numA + " and " + numB + " is " + (numA + numB));
	 //     System.out.printf("The sum of the %d and %d is %d", numA, numB, numA + numB);
	
	      
	 //     scanner.close();
	      
	      
	      Scanner scanner = new Scanner (System.in);
	        int numA = scanner.nextInt();
	        int numB = scanner.nextInt();
	        int numC = scanner.nextInt();
	        System.out.printf("%d %d %d ", numA,numB,numC);
	    
	        // numA > numB ==> numB ==> numC
	        System.out.println(numA > numB && (numB > numC));
	        
	        
	        scanner.close();
	}

}
