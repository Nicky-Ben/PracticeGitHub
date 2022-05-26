package day11_3rdReviev;

public class Task_2 {

	public static void main(String[] args) {
	
		/*
		 * Write program that count number of digits in number
		 * Example:
		 * 345234
         *345234 has 6 digits
		 */
		  
		
		int count = 0;
		int number = 100_000;
		int startNumber = number;
		while (number != 0) {
			number = number / 10;
			count++;
			
		}
		System.out.printf("%s has %s digits",startNumber,count);

	}

}
