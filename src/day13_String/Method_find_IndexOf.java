package day13_String;

public class Method_find_IndexOf {

	public static void main(String[] args) {
	  //	           012345678910     17
		String name = "President George Washington";

		System.out.println(name.charAt(8));
		System.out.println(name.charAt(9));
		System.out.println(name.charAt(10));
		System.out.println(name.charAt(17));
		
		System.out.println(name.indexOf('p'));  // -1
		System.out.println(name.indexOf('p'));  // -1
		
		System.out.println(name.indexOf('e'));   // 2
		System.out.println(name.indexOf('e', 3));   // 6
		System.out.println(name.indexOf('e', 9));   // 11
		
		System.out.println(name.lastIndexOf('e'));   // 15
		
		System.out.println(name.indexOf("George"));   // 10
		
		System.out.println(name.indexOf("rge"));    // 13
		
		System.out.println(name.indexOf("Bob"));   //  -1
		
		System.out.println(name.indexOf(("George")) > -1);  // true
		
		System.out.println(name.indexOf("Bob") > -1);       // false

	}

}
