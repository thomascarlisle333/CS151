import java.util.Scanner;

class CalcAreaOfTriangle {
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		double s, a, b, c;
		double area, roundedArea;
		
		System.out.println("What is the length of side 'a' of the triangle?");
		a = scan.nextDouble();
		
		System.out.println("What is the length of side 'b' of the triangle?");
		b = scan.nextDouble();
		
		System.out.println("What is the length of side 'c' of the triangle?");
		c = scan.nextDouble();
		
		// Check the sides are of a valid triangle
		if (a+b>c && b+c>a && c+a>b){
			s = ((a+b+c)/2);
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			roundedArea = (double)Math.round(area*1000)/1000;
			System.out.println();
			System.out.println("The area of the triangle is " + roundedArea);
			System.out.println();
		} else {
			System.out.println();
			System.out.println("The triangle sides are invalid");
			System.out.println();
		}
			
			
		
	}
}
		