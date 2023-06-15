import java.util.Scanner;

class DetermineIfLeapYear {
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		int inputYear;
		
		int remain4, remain100, remain400; 
		boolean divis4 = false, divis100 = false, divis400 = false;
		
		System.out.println("What year would you like to check?");
		inputYear = scan.nextInt();
		
		remain4 = inputYear % 4;
		remain100 = inputYear % 100;
		remain400 = inputYear % 400; 
		
		if (inputYear>1582){
			if (remain4 == 0){	// check if it is divisible by 4
				divis4 = true;
			}
			if (remain100 == 0){	// check if it is divisible by 100
				divis100 = true;
			}
			if (remain400 == 0){	// check if it is divisible by 400
				divis400 = true;
			}
			if (divis4){
				if (divis100 && !divis400){
					System.out.println();
					System.out.println("It's NOT a leap year!");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("It's a leap year!");
					System.out.println();
				}
					
			} else {
				System.out.println();
				System.out.println("It's NOT a leap year!");
				System.out.println();
			}
		} else {
			System.out.println();
			System.out.println("This year was before the Gregorian Calendar was established!");
			System.out.println();
		}
			
			
	}
}