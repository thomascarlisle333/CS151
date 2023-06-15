
import java.util.Random;
import java.util.ArrayList;
import java.text.*;
import java.util.Scanner;


public class RandomTest{
	
	public static void main(String[] args){
		
		int random1=1, random2=999, attempt = 1, count = 1, OneCount = 0, sum = 0, add = 0;
		int rec1, rec2, rec3, rec4, rec5, rec6, rec7, rec8, rec9, rec10;
		
		Random gen = new Random();
		ArrayList<Integer> randoms = new ArrayList<>();
		ArrayList<Integer> recordNumAttempts = new ArrayList<>();
		ArrayList<Integer> attemptsIndex = new ArrayList<>();
		ArrayList<Integer> attemptsVal = new ArrayList<>();

		ArrayList<Integer> attempts = new ArrayList<>();
		NumberFormat perc = NumberFormat.getPercentInstance();
		perc.setMaximumFractionDigits(3);
		//Scanner scan = new Scanner(System.in);
		Scanner scan;
		
		scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Please enter the number of times you would like to ask the gods for a lucky number: ");
		int iterations = scan.nextInt()+1;
		System.out.println("Please enter the upper limit of your desired random number: ");
		int range = scan.nextInt();
		System.out.println("Please enter the number you would like to record: ");
		int numComp = scan.nextInt();
		int totalCalculations = 0;
		long startTime = System.currentTimeMillis();
		
		while (count<iterations){
			
		
			while (random1 != random2){
				random1 = gen.nextInt(range)+1;
				random2 = gen.nextInt(range)+1;
				attempt++;
				totalCalculations++;
				//System.out.println("Random Number 1: " + random1);
				//System.out.println("Random Number 2: " + random2);
				//System.out.println("Attempt: " + attempt);
			}
			//System.out.println();
			System.out.print("\r" + perc.format((float)count/iterations));
			randoms.add(random1);
			attempts.add(attempt);
			
			if (random1 == numComp) {
				OneCount += 1;
			}
			
	
			random1 -=1;
			count++;
			attempt = 0;
		}
		
		int max = Integer.MIN_VALUE;  // Initialize max with the smallest possible integer value
        int min = Integer.MAX_VALUE;
		
		for (int numbmin : attempts){
			if (numbmin < min) {
				min = numbmin;
			}
		}
		
        for (int number : attempts) {
            if (number > max) {
                max = number;
            }
        }
		
		for (int it = 0; it<randoms.size(); it++){
			if (randoms.get(it) == numComp){
				attemptsIndex.add(it);
			}
		}
		while (add< attemptsIndex.size()){
			attemptsVal.add(attempts.get(attemptsIndex.get(add)));
			sum += attempts.get(attemptsIndex.get(add));
			//sum += attemptsIndex.get(add);
			add++;
		}
		
		float average = (float)sum/attemptsIndex.size();
		
		int attmin = Integer.MAX_VALUE;
		int attmax = Integer.MIN_VALUE;

		for (int findmin : attemptsVal){
			if (findmin<attmin){
				attmin=findmin;
			}
		}
		
		for (int findmax : attemptsVal){
			if (findmax>attmax){
				attmax = findmax;
			}
		}
		
		
		
		System.out.println();
		//System.out.println("Your lucky random values are " + randoms);
		//System.out.println("Your attempts were: " + attempts);
		
		
		//System.out.println();
		//System.out.println("Your maximum required attempts were: " + max);
		//System.out.println("Your maximum required attempts were: " + min);
		System.out.println();
		System.out.println("The gods agreed on your number: " + OneCount + " times!");
		//System.out.println();
		System.out.println("This is roughly " + perc.format((float)OneCount/iterations));
		//System.out.println();
		System.out.println("On average, it took " + average + " attempts to get the number " + numComp);		
		//System.out.println();
		//System.out.println();
		System.out.println("It took a max attempts of " + attmax + " to find " +numComp);
		System.out.println("It took a min attempts of " + attmin + " to find " +numComp);
		System.out.println();
		long endTime = System.currentTimeMillis();
		
		double durationSeconds = (endTime - startTime)/1000.0;
		double calculationsPerSecond = totalCalculations/durationSeconds;
		
		System.out.println("Duration in seconds: " + durationSeconds);
		System.out.println("Calculations per second: "+ calculationsPerSecond);
		System.out.println("Total calculations: " + totalCalculations);
		System.out.println();
		
	}
}
			
		
		
	