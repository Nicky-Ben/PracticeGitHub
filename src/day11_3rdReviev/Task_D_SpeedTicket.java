package day11_3rdReviev;

import java.util.Scanner;

public class Task_D_SpeedTicket {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

	      System.out.println("What is driver's first name?");
	      String fn = sc.next();

	      System.out.println("What is driver's last name?");
	      String ln = sc.next();

	      System.out.println("What is driver's age?");
	      int age = sc.nextInt();

	      System.out.println("What is the speed limit (mph)?");
	      int speedLimit = sc.nextInt();

	      System.out.println("What is driver's speed (mph)?");
	      int actualSpeed = sc.nextInt();

	      System.out.println("Is this a construction zone (Y/N)?");
	      char isConstructionZone = sc.next().charAt(0);

	      double fine = 0;
	      int overSpeedLimit = actualSpeed - speedLimit;

	      if (overSpeedLimit > 5 && overSpeedLimit <= 20) {
	         fine = (overSpeedLimit/5)*30; // every 5mph over, charge 30 each
	      } else if (overSpeedLimit > 20) { // overSpeedLimit greater 20 mph
	         fine = (overSpeedLimit/5)*50; // every 5mph over, charge 50 each
	      } // 250

	      if (isConstructionZone == 'Y') fine = fine * 2; // fine =* 2;
	      if (age < 21 && overSpeedLimit > 20) fine = fine + 300;

	      System.out.println("========================");
	      System.out.printf("Driver name:\n\t%s %s",fn,ln);
	      System.out.println();
	      System.out.printf("Speed limit:\t%d mph",speedLimit);
	      System.out.println();
	      System.out.printf("Current speed:\t%d mph",actualSpeed);
	      System.out.println();
	      System.out.printf("Construction Zone (Y/N)?: %c",isConstructionZone);
	      System.out.println();
	      System.out.printf("Speeding fine: $%.2f",fine);
	      System.out.println();
	      System.out.println("========================");

	}

}
