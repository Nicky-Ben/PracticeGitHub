package day13_String;

public class StringMethod_Equality {

	public static void main(String[] args) {
		
		String word1 = "Hello";
		String word2 = "Hello";
		
		boolean b = word1.equals(word2);
		// returns true if the string word1 is equal to word2
		
		b = "Rsiders".equals("Raiders");  // true
		b = "Raiders".equals("raiders");  // false
		b = "Raiders".equalsIgnoreCase("raiders");  // true

		if(team.equalsIgnoreCase("raiders")) {  // 
		System.out.println("Go You" + team);
		}
	}

}
