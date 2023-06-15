import java.util.Scanner;

class CalcFillTime {
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		int rate = 70;
		float capacity = 7.48f;
		float time;
		float volume;
		float poolCapacity;
		System.out.println("What is the length of the pool?");
		float length = scan.nextFloat();
		
		System.out.println("What is the width of the pool?");
		float width = scan.nextFloat();
		
		System.out.println("What is the depth of the pool?");
		float depth = scan.nextFloat();
		
		volume = (length*width*depth)/rate;
		poolCapacity = (capacity*volume);
		time = poolCapacity/rate;
		
		System.out.println();
		System.out.println("The time required to fill this pool is: " + time + " minutes");
		System.out.println();
	}
}
		