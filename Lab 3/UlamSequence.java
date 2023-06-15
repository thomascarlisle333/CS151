/*import java.util.Scanner;

public class UlamSequence{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number to initiate its Ulam sequence:");
		int value = scan.nextInt();
		
		int remainder = value % 2;
		
		while (value != 1){
			remainder = value % 2;
			if (remainder == 0) {
				value /= 2;
				System.out.println(value);
			}else {
				value = (value*3) + 1;
				System.out.println(value);
			}
		}
	}
}
*/
import java.util.Scanner;

public class UlamSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("Ulam sequence for " + number + ":");
        System.out.print(number + " ");

        int count = 1;
        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }

            System.out.print(number + " ");

            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
