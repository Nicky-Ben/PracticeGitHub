package day13_String;

public class StringReplaceMethod {

	public static void main(String[] args) {
		
		
		String word = "Car";
		       word = word.replace('r', 't');
		       System.out.println(word);           // cat
		       
		       
		String str = "tomato";
		System.out.println(str);      // tomato
		
		str = str.replace('t', 'p');
		System.out.println(str);       // pomamo
		
		String str2 = "tomato";
		System.out.println(str);
		
		str2 = str2.replace("to", "mo");
		 System.out.println(str2);         // momato
		
		
		    String str3 = "How Turkey spoiled NATO's historic moment with Finland, Sweden";
	        
	         str3 = str3.replace("Turkey", "India");
	         System.out.println(str3);
	//How India spoiled NATO's historic moment with Finland, Sweden        
	        
	        
	         
	        str3 = str3.replace(" ", "");
	        System.out.println(str3);
	//HowIndiaspoiledNATO'shistoricmomentwithFinland,Sweden	
		
		
		

	}

}
