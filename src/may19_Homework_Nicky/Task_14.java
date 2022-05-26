package may19_Homework_Nicky;

public class Task_14 {

	public static void main(String[] args) {
		
		/*Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "tecHCIrcle"
                        lastName = "SCHOOL";

                    output:
                        Techcircle School
         */
		
        String str1 = "tecHCIrcle";
		
		str1 = str1.replace("tecHCIrcle","Techcircle");
		System.out.println(str1);
		
		String str2 = "SCHOOL";
		
		str2 = str2.replace("SCHOOL","School");
		System.out.println(str2);
		
		
		String str = str1.concat(str2);
		System.out.println(str);
		
		
		}	
	}
