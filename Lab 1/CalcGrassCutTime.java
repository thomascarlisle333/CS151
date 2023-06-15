import java.util.Scanner;

class CalcGrassCutTime {
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		float YardsToMeters = 0.8f;
		float yardWidth, yardLength, houseWidth, houseLength;
		float yardArea, houseArea, grassArea, grassAreaInSqM, timeInMin, timeInSec;
		float TimeInMin;
		
		System.out.println("What is the length of the yard?");
		yardLength = scan.nextFloat();
		
		System.out.println("What is the width of the yard?");
		yardWidth = scan.nextFloat();
		
		System.out.println("What is the length of the house?");
		houseLength = scan.nextFloat();
		
		System.out.println("What is the width of the house?");
		houseWidth = scan.nextFloat();
		
		 yardArea = yardWidth * yardLength;
		 houseArea = houseWidth * houseLength;
		 grassArea = yardArea - houseArea;
		 grassAreaInSqM = grassArea * YardsToMeters;
		 timeInSec = grassAreaInSqM / 2;
		 timeInMin = timeInSec / 60;

		
		System.out.println();
		System.out.println("The time required to fill this pool is: " + timeInMin + " minutes");
		System.out.println();
	}
}
		