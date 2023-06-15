import java.util.Scanner;

class CalcMyChange {
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		int numQuarters, numDimes, numNickels, numPennies;
		int valQuarters, valDimes, valNickels, valPennies;
		int dollars, cents, valTotal;
		final int Q = 25, D = 10, N = 5, P = 1;
		
		System.out.println("How many Quarters do you have?");
		numQuarters = scan.nextInt();
		valQuarters = Q*numQuarters;
		
		System.out.println("How many Dimes do you have?");
		numDimes = scan.nextInt();
		valDimes = D*numDimes;
		
		System.out.println("How many Nickels do you have?");
		numNickels = scan.nextInt();
		valNickels = N*numNickels;
		
		System.out.println("How many Pennies do you have?");
		numPennies = scan.nextInt();
		valPennies = P*numPennies;
		
		 valTotal = valQuarters + valDimes + valNickels + valPennies;
		 dollars = valTotal/100;
		 cents = valTotal%100;

		
		System.out.println();
		System.out.println("You have " + dollars + " dollars and " + cents + " cents!");
		System.out.println();
	}
}
		