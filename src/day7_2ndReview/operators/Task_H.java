package day7_2ndReview.operators;

public class Task_H {

	public static void main(String[] args) {
		
		int stylishness_Me = 3;
		int stylishness_Date = 8;
		
		if (stylishness_Me >= 2 || stylishness_Me <= 2) {
			System.out.println("Yes,you both will definitely get a table");
		}
		else if (stylishness_Me <= 8 || stylishness_Date <= 8) {
			System.out.println("Sorry, but no table for both of you.");
		}
		else {
			System.out.println("Ahh, you maybe lucky tinigt");
		}

	}

}
