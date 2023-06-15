import java.util.Scanner;
import java.text.NumberFormat;

public class CalcGrossWeeklyWage{
	
	public static void main (String[] args){
		
		final float hourlyRate = 20.0f;
		final int Standard = 40; //standard hours in a work week
		
		float overtimeWages = 0.0f, standardWages;
		int numHoursWorked, overtimeHours = 0;
		float grossWeeklyWage;
		
		Scanner scan = new Scanner(System.in);
		NumberFormat fmtMoney = NumberFormat.getCurrencyInstance();
		
		System.out.println();
		System.out.println("How many hours per week will the employee work?");
		numHoursWorked = scan.nextInt(); 
		
		if (numHoursWorked > Standard){
			
			overtimeHours = numHoursWorked - Standard;
			standardWages = Standard*hourlyRate;
			overtimeWages =(numHoursWorked - Standard)*hourlyRate*1.5f;
			grossWeeklyWage = standardWages + overtimeWages;
			grossWeeklyWage = Math.round(grossWeeklyWage*100)/100f;
			System.out.println();
			System.out.println("You worked overtime!");
			System.out.println();
			
		}else {
			grossWeeklyWage = numHoursWorked*hourlyRate;
			System.out.println();
			System.out.println("The employee worked less than the standard hours this week.");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("The employee's gross weekly wage was " + fmtMoney.format(grossWeeklyWage) + " this week!");
		System.out.println("The employee earned an extra " + fmtMoney.format(overtimeWages) + " from working an extra " + overtimeHours + " hours this week!");
	}
}
		
		
		
		