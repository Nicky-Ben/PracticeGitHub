package may13_ControlFlowHomework_Nicky;

import java.util.Scanner;

public class Task_4_CalcurateSalaryTaxRate {

	public static void main(String[] args) {
		/*
		 * Write a program that can calculate the salary after tax based
		 * on the following requirements
		 * the tax rate are:
		 * 35% for salary of 130K or more
		 * 30% for salary of 130K 
		 * 25% for salary of 100K 
		 * 20% for salary of 80K 
		 * in addition , if the person is married, he /she will pay 5% less tax.
		 * */
		
		int married = 0; 
		int netSalary = 0;
		int income = 0;
		double tax = 0, it;
		double netIncome = 0;
		netIncome = income - tax;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Income: ");
		it = scan.nextDouble();
		
		if (it >= 80000 || tax >= 20/100 * 80000) {
		    
		    
		} else if (it >= 100000) {
		    tax = 25 / 100 * 100000;
		  
		} else if (it >= 130000) {
			tax = 30 / 100 * 130000;
			
		}  else if (it > 130000) {
			tax = 35 /100 * 130000;
		}
		
		
		
		}

}
