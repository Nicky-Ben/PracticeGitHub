package day_4rdReview;

import java.util.Scanner;

public class NesedLoop {

	public static void main(String[] args) {
		
		// while
		// do while
		// for
		// to 
		
//		for (int i = 0; i < 10; i++) {  // 1 Loop print 0-9
//			System.out.println(i+"");
			
//			for (int j = 0; j < 10; j++) {
//				System.out.println(j+"");     // 2 Loop print 0-9
//			}
		
	//        	
		
//		for (int row = 1; row <= 8; row++)  {     //row
//			for (int column = 0; column < 5; column++) {  //  column
//		}
//			System.out.print(column+" ");
        
//        System.out.println();
     Scanner sc = new Scanner(System.in);
        // break Loop
        for (int row = 1; row <= 8; row++)  {
        	System.out.println(row);
        	if (row == 5) break;   // this will break out of the loop
        }
        
        
        		  
        while (true) {
        	String input = sc.next();
        	// scanner take input from user
        	if (input.equals("exit")) break;
        	System.out.println(input);
        	System.out.println("======");
        }
        
        sc.close();
	}

}
