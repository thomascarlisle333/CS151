import java.util.Scanner;

class ReverseMyThreeDigNum {
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		int input, first, second, third, remainderOne, remainderTwo, output;
		
		System.out.println("What number would you like me to reverese?");
		input = scan.nextInt();
		
		first = input/100;
		remainderOne = input % 100; 
		
		second = remainderOne/10;
		third = remainderOne % 10;
		
		third *= 100;
		second *= 10;
		first *= 1;
		output = third + second + first;
		
		
		
		System.out.println();
		System.out.println("Here you go: " + output);
		System.out.println();
	}
}
		