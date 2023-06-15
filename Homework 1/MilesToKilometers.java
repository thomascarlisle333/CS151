import java.util.Scanner;

class MilesToKilometers {
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		float miles;
		double kilometers;
		final double KilometersInAMile = 1.60935;
		
		System.out.println("Please enter the number of miles to be converted to kilometers:");
		miles = scan.nextFloat();
		
		kilometers = (double)miles*KilometersInAMile;
		
		
		
		System.out.println();
		System.out.println("The number of kilometers in " + miles + " is " + kilometers);
		System.out.println();
	}
}
		