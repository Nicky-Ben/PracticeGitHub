package may13_ControlFlowHomework_Nicky;



public class Task1_SalaryCalculator {

	public static void main(String[] args) {
		
		
		
		
		
		double weeklyHour = 45; 
		double hourlyRate = 50;
		double stateTax = 0;
		double stateTaxRate = 6;
		double federalTax = 0;
		double federalTaxRate = 26;
		double salaryBeforeTax;
		double totalTax =0;
		double netIncome = 0;
		
		salaryBeforeTax = hourlyRate * weeklyHour * 52;
		
		federalTax = salaryBeforeTax * federalTaxRate /100;
		
		stateTax = salaryBeforeTax * stateTaxRate / 100;
		
		totalTax = federalTax + stateTax ;
		
		netIncome = salaryBeforeTax - totalTax;
		
		System.out.println("Gross pay is "+salaryBeforeTax);
		
		System.out.println("federalTax is "+federalTax);
		
		System.out.println("stateTax is "+stateTax);
		
		System.out.println("totalTax is "+totalTax);
		
		System.out.println("netIncome is "+netIncome);
		
	}

}
