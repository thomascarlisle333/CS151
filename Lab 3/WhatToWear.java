import java.util.Scanner;

public class WhatToWear{
	
	public static void main(String[] args){
		
		int outsideTemp;
		boolean rain = false, RainCoatAndUmbrella = false, Overcoat = false, JacketAndUmbrella = false, Jacket = false, Umbrella = false;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("What is the outside temperature?");
		outsideTemp = scan.nextInt();
		
		System.out.println("Is it raining? Enter true for yes and false for no.");
		rain = scan.nextBoolean();
		
		if (outsideTemp<=60 && rain){
			
			System.out.println();
			System.out.println("Wear a raincoat and bring an umbrella!");
			RainCoatAndUmbrella = true;
		}
		if (outsideTemp<=60 && !rain){
			
			System.out.println();
			System.out.println("Wear an overcoat!");
			Overcoat = true;
		}
		if (outsideTemp < 70 && outsideTemp > 60){
			if (rain) {
				System.out.println();
				System.out.println("Wear a jacket and bring an umbrella!");
				JacketAndUmbrella = true;
			} else {
				System.out.println();
				System.out.println("Wear a jacket!");
				Jacket = true;
			}
		}
		if (outsideTemp>=70 && rain){
			System.out.println();
			System.out.println("Bring an umbrella!");
			Umbrella = true;
		}
		if (!RainCoatAndUmbrella && !Overcoat && !JacketAndUmbrella && !Jacket && !Umbrella){
			System.out.println();
			System.out.println("The weather is great! Nothing to worry about!");
		}
	}
}
				
				
				