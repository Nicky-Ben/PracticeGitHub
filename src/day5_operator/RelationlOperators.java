package day5_operator;

public class RelationlOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println(a > b);// false
		System.out.println(a < b);
		
		boolean result = a < b; // true
		System.out.println(result);
		
		result = a == b; // ture
		
		System.out.println(result);
		
		System.out.println(a != b);
		
		result = a + b == c;
		
		System.out.println(result);
		
		System.out.println(a * b >= c);
		
		result = a + b <= c;  // 3 <= 3
		
		System.out.println(result);
		
		System.out.println(a + b <=c );
		

	}

}
