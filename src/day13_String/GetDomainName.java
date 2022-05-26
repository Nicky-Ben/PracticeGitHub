package day13_String;

public class GetDomainName {

	public static void main(String[] args) {
		
		
		// help@walmart.com
		// help@aws.com
		//help@uscis.gov
		//help@github.com
//                      01234		
		String email = "help@walmart.com";
		System.out.println(email.indexOf('@'));  //4
		
		
		System.out.println(email.substring(4));       // @walmart.com
		System.out.println(email.substring(4 + 1));   // walmart.com
		System.out.println(email.lastIndexOf('.'));   // 12
		
		System.out.println(email.substring(4+1 , 12));          // walmart
		
		int startingIndex = email.indexOf('@')+ 1;
		
int endingIndex = email.lastIndexOf('.');
        
        
        String domainName = email.substring(startingIndex, endingIndex);
        
        System.out.println(domainName);

	}

}
