package day5_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// && , || , !
		
		// && AND 
		 
		 /*
		  * ConditionA  ConditionB   Result
		  * true           true       true
		  * true           false      false
		  * false          true       false
		  * false          false      false
		  * 
		  */
		 
		 int a = 10;
		 int b = 5;
		 int c = 15;
		 
		 boolean conditionA = a+b == c;
		 boolean conditionB = c-b == a;
		 
		 System.out.println(conditionA && conditionB);
		 
		 System.out.println((a+b == c)&& (c-b == a));
		 
		 conditionA = c / b >= 3;
		 conditionB = a+b> c;
		 
		 boolean result = conditionA && conditionB;
		 
		 System.out.println(result);
		 
		 String UserName = "techcircle";
		 String password = "abc123";
		 
		 System.out.println(UserName =="techcircle" && password == "abc123");
		 System.out.println(UserName =="hello" && password == "abc123" );
		 
		 System.out.println(UserName =="techcircle" && password == "abc124");
		 System.out.println(UserName =="hello" && password == "abc124" );
				 
		 /*
		  * ConditionA  ConditionB   Result
		  * true           true       true
		  * true           false      false
		  * false          true       false
		  * false          false      false
		  */
		 
		 a = 1;
		 b = 2;
		 c = 3;
		 
		 conditionA = a+b ==c; // true
		 conditionB = a-b >  c; // false
		 
		 System.out.println(conditionA || conditionB);
		 
		 System.out.println(true || false);
		 
		 System.out.println(false || true);
		  
		 System.out.println(false || false); 
		 
		 
		 a = 1;
		 b = 2;
		 c = 3;
		 
		 conditionA = a+b ==c; // true
		 conditionB = a-b >  c; // false

		 System.out.println(conditionA || conditionB);
		 
		 System.out.println(conditionA || c/a==3);
		 
		 System.out.println(c+a < b+a || a <5);
		 
		 System.out.println(c+a > b+a || a <5);
		 
		 // Logical not !
		 /*
		  * !true == false
		  * !false == true
		  * */
		 
		 conditionA = true;
	     conditionB = false;
	        
	     System.out.println(!conditionA);
	     System.out.println(!conditionB);
		 
	}

}



