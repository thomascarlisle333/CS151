import java.util.Scanner;

class CalcMyInterest {
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		float interest, principal, rate, time;
		
		System.out.println("What is the principal of your loan?");
		principal = scan.nextFloat();
		
		System.out.println("What is the interest rate (%) of your loan?");
		rate = scan.nextFloat();
		
		System.out.println("How many days will it take you to pay off your loan?");
		time = scan.nextFloat();
		
		interest = principal*(rate/100)*(time/365);
		float roundedInterest = Math.round(interest * 100.0f) / 100.0f;

		
		System.out.println();
		System.out.println("You will pay: $" + roundedInterest + " in interest :(");
		System.out.println();
	}
}
		