import java.util.Scanner;

class MyIntroduction {
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		String name, college, petname;
		int age;
		
		System.out.println("What is your name?");
		name = scan.nextLine();
		
		System.out.println("How old are you?");
		age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("What is the name of your school?");
		college = scan.nextLine();
		
		System.out.println("What is your pet's name?");
		petname = scan.nextLine();
		
		
		
		
		
		System.out.println();
		System.out.println("Hello, my name is " + name + " and I am " + age + " years \nold. I'm enjoying my time at " + college + ", though\nI miss my pet " + petname + " very much!");
		System.out.println();
	}
}
		