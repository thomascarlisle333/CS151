import java.util.StringTokenizer;
import java.util.Scanner;

class TokenizePhoneNumber {
		
	public static void main(String[] args){
		// Create scanner
		Scanner scan = new Scanner(System.in);
		
		// Prompt user input 
		System.out.println();
		System.out.println("Please type the phone number in (xxx)xxx-xxxx format: ");
		
		// Scan input
		String inputPhoneNumber = scan.nextLine();
		
		// Get area code with getAreaCode()
		String areaCode = getAreaCode(inputPhoneNumber);
		
		// Print area code
		System.out.println();
		System.out.println("The area code is: " + areaCode);
		
		// Get exchange with getExchange() 
		String exchange = getExchange(inputPhoneNumber);
		
		// Print exchange
		System.out.println();
		System.out.println("The exchange is: " + exchange);
		
		// Get extension with getExtension
		String extension = getExtension(inputPhoneNumber);
		
		// Print extension 
		System.out.println();
		System.out.println("The extension is: " + extension);
		System.out.println();
		
	}
		
	public static String getAreaCode(String inputPhoneNumber) {
		String firstFour;
		StringTokenizer stringTokenizer = new StringTokenizer(inputPhoneNumber, ")");		
		firstFour = stringTokenizer.nextToken(); 
		
		StringTokenizer stringTokenizer1 = new StringTokenizer(firstFour, "(");
		String areaCode = stringTokenizer1.nextToken();
		
		//String areaCode = firstFour.substring(1, 4);
		
		return areaCode;
	}  
	
	public static String getExchange(String inputPhoneNumber) {		
		StringTokenizer stringTokenizer1 = new StringTokenizer(inputPhoneNumber, ")");
		
		stringTokenizer1.nextToken();
		String lastEight = stringTokenizer1.nextToken();
		StringTokenizer stringTokenizer2 = new StringTokenizer(lastEight, "-");

		String exchange = stringTokenizer2.nextToken();
		
		// int exchange = Integer.parse(exchangeStr);
		return exchange;
	}
	
	public static String getExtension(String inputPhoneNumber) {
		StringTokenizer stringTokenizer = new StringTokenizer(inputPhoneNumber, "-");
		stringTokenizer.nextToken();
		String extension = stringTokenizer.nextToken();
		return extension; 
	}	
}