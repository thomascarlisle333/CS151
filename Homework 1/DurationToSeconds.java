import java.util.Scanner;

class DurationToSeconds {
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		int hours, minutes, seconds, totalSeconds;
		
		
		System.out.println("How many hours have passed?");
		hours = scan.nextInt();
		
		System.out.println("How many minutes have passed?");
		minutes = scan.nextInt();
		
		System.out.println("How many seconds have passed?");
		seconds = scan.nextInt();
		
		totalSeconds = hours*3600 + minutes*60 + seconds;
		
		
		
		System.out.println();
		System.out.println("The time elapsed has been " + totalSeconds + " seconds!");
		System.out.println();
	}
}
		