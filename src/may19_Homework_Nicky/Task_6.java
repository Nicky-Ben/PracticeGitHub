package may19_Homework_Nicky;

public class Task_6 {
	
	public static void main(String[] args) {
		
	/*	write a program that can return the initials of the user

	            ex:
	                techcircle
	                school

	            output:
	                T.S

	       Note: Pay attention to the example output
		*/
		
		String str1 = "techcircle";
		str1 = str1.replace('t','T');
		System.out.println(str1);
		
		
		String str2 = "school";
		str2 = str2.replace('s','S');
		System.out.println(str2);
		
		System.out.print(str1.charAt(0)+"." +str2.charAt(0));
		
		}
}