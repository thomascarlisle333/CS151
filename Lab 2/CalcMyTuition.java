import java.util.Scanner;

class CalcMyTuition {
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		int numCredits, cost;
		final int CostPerCredit = 75;
		
		System.out.println("How many credits are you taking?");
		numCredits = scan.nextInt();
		
		
		cost = numCredits*CostPerCredit;
		
		if (cost > 1000) {
			cost = 1000;
		}
		
		
		
		System.out.println();
		System.out.println("Your tuition will cost: $" + cost);
		System.out.println();
	}
}
		