package day5_operator;

public class PEMDAS {

	public static void main(String[] args) {
		
		/*
		 * PEMDAS (Parenthesis, Exponents, Multiplication and Division,
		 *  Java reads from left to right.*/
		  
		      
		 
		int result = 1+2+3-4;
		
		System.out.println(result);
		
		result = 1+2+(3-4);
		
		System.out.println(result);
		
		result = 1+2+3*4;

		System.out.println(result);
		
		
		result = 11- 4*3 +(10/2)*5 +8;
		//       11 - 12 + 25       +8
		
		System.out.println(result);
		
		
		
		

	}

}
