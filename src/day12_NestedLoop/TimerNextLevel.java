package day12_NestedLoop;

import java.util.Scanner;

public class TimerNextLevel {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How long to want to wait for?");
//		int waitTime = 1;
		
		int waitTime = scan.nextInt();
		
		System.out.println(waitTime+" minute time start");
		
		for (int i =  waitTime-1; i >= 0; i--) {
	//		System.out.println(i);
			
		for (int j = 59 ; j >= 0; j--) {
			System.out.println(i+":"+j);
			Thread.sleep(1000);
		}
	}
		System.err.println("Time's UP!!!");
		
		scan.close();
		
		
		
		

	}

}
