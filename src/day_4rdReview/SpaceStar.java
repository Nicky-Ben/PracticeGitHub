package day_4rdReview;

public class SpaceStar {

	public static void main(String[] args) {
		
		/*   ***** 4
           *****   3
          *****    2
         *****     1
        *****      0
		 * */

        char star = '*';
		
		char space = '_';
		int n = 5;
		
		for (int i = 0; i < n; i++) {  // run 5 time 
			
			
	//  space loop		
			for (int j = 0; j < i; j++) {
				System.out.print(space);
			}
	//star loop		
			for (int j = 0; j < n; j++) {
				System.out.print(star);
			}
		System.out.println();
		}
		
		
		
	}

}
