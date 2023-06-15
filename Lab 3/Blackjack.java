
import java.util.Scanner;

public class Blackjack{
	
	public static void main(String[] args){
		
		int value, lastValue = 0, sum = 0;
		
		Scanner scan = new Scanner(System.in);
		while (sum<21){
			System.out.println("Enter a value between 1 and 5 to add to the sum:");
			value = scan.nextInt();
			if(1<=value && value<=5){
				lastValue = value;
				sum += value;
			}else {
				System.out.println();
				System.out.println("Invalid value.");
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("By entering " + lastValue + " you have put your sum over 21.");
		System.out.println("Your total is: " + sum);
		System.out.println();
	}
}
			
		
		
	