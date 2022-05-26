package day10_loopReview;

public class Task5_SumOfOddNumber {
	
	// Write a java program to print sum of odd number between 1 to 100.

	public static void main(String[] args) {
		
		// int sum = 1;
		
		//	for (int i = 1; i <= 100 ;i++) {
				
	     //      if (i % 2 ==1) {
	    //   	   sum += i;
	    //       }
	 		
	      //      System.out.printf(" The sum of odd numbers between 1 & 100 is %d ", sum);
	      //     }	
		
	
			
		//	int total = 0;

	    //   int count = 1;

	   //    while (count < 101) {
	   //         if (count % 2 == 1) 
	   //         {
	   //             total += count;
	   //            System.out.println(count);
	    //        }
	    //    count++;
	       
	     //   }
	     //   System.out.println(total);
	        
		int sum = 0;
        int i = 1;

        for ( i=1 ; i<=100 ; i++){

             if (i%2==0){

                 sum+=i;

             }

        }  System.out.printf("The sum of even number between 1 & 100 is %d", sum);
	        
	}
}
