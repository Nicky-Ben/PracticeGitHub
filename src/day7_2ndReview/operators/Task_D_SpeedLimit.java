package day7_2ndReview.operators;

import java.util.Scanner;

public class Task_D_SpeedLimit {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		String ln = "";
		String fn = "";
		int age = 0;
		int speedLimit = 0;
		int actualSpeed = 0;
		 int fine = 0;
		boolean isConstructionZone = false;
		
		//int ovetSpeedLimit = actualSpeed - speedLimit;
		int overSpeedLimit = 21;
		

		if (overSpeedLimit > 5 && overSpeedLimit <= 20) {
			fine = (overSpeedLimit/5)*30; // every 5mph over, charge 30
		} else if (overSpeedLimit > 20) { // overSpeedLimit grater 20
			fine = (overSpeedLimit/5)*50; // every 5mph over, charge 50
		}
		
	//	if (isConstructionZone) fine = fine * 2;  // fine =* 2;  // 200
		
	//	if (isConstructionZone = 'y') fine = fine * 2;
	//	if (age < 21 && overSpeedLimit > 20) fine = fine + 300;
		
		System.out.println(fine);
		
		
		
		

	}

}
