package day08comtrol_flow;

public class ElseIfStatement {

	public static void main(String[] args) {
		
		int age = 6;
		String age1 = "Infancy";
		String age2 = "Tooddler";
		String age3 = "Early school age";
		String age4 = "Middle school age";
		String age5 = "Early adolescence";
	    String age6 = "later adolescence";
	    String age7 = " Early adulthood";
	    String age8 = "Middle adullthood";
	    String age9 = "later adulthood";

				
				
				 if (age >= 1 && age <= 2) {
			            System.out.println(age1);
			        } else if (age > 2 && age <= 4) {
			            System.out.println(age2);
			        } else if (age > 4 && age <= 6) {
			            System.out.println(age3);
			        }else if ( age > 6 && age <= 8) {
			            System.out.println("Middle school age");
			        }else if ( age > 8 && age <= 10) {
			            System.out.println("Early adolescence");
			        } else {
			            System.out.println("Invalid age");
			        }		
				
				
	}

}
