
import java.util.Scanner;

public class TriangleType {
		
	public static void main(String[] args){
		
		// Create scanner
		Scanner scan = new Scanner(System.in);
		
		// Prompt user for input a  
		System.out.println();
		System.out.println("Please enter dimension a of your triangle: ");
		
		// Scan input a
		int a = scan.nextInt();
		
		// Prompt user for input b
		System.out.println();
		System.out.println("Please enter dimension b of your triangle: ");
		
		// Scan input b
		int b = scan.nextInt();			
		
		// Prompt user for input c
		System.out.println();
		System.out.println("Please enter dimension c of your triangle: ");
		
		// Scan input c
		int c = scan.nextInt();
		
		
		//Make a new Triangle instance and pass the sides into the constructor
		Triangle triangle1 = new Triangle(a,b,c);
		
		// Check to see if the input sides make a valid triangle using isValidTriangle()
		boolean isValidTriangle = triangle1.isValidTriangle();
		
		// If the input sides make a valid triangle, determine the type of triangle
		if (isValidTriangle){
			
			// Check if it is a right triangle with isRightTriangle()
			boolean isRightTriangle = triangle1.isRightTriangle();
		
		
			// Check if it is an isosceles triangle with isIsoscelesTriangle()
			boolean isIsoscelesTriangle = triangle1.isIsoscelesTriangle();

		
			// Check if it is a scalene triangle with isScaleneTriangle()
			boolean isScaleneTriangle = triangle1.isScaleneTriangle();

		
			// Check if it is an equilateral triangle with isEquilateralTriangle
			boolean isEquilateralTriangle = triangle1.isEquilateralTriangle();
			
			
			// If it is a right triangle, tell the user
			if (isRightTriangle){
				
				//if it is also a scalene triangle, tell the user it is both right and scalene
				if (isScaleneTriangle){
					
					System.out.println();
					System.out.println("This is both a scalene and a right triangle!");
					System.out.println();
				}else{
				System.out.println();
				System.out.println("This is a right triangle!");
				System.out.println();
				}
			}
			
			// If it is an isosceles triangle, tell the user
			if (isIsoscelesTriangle){
				System.out.println();
				System.out.println("This is an isosceles triangle!");
				System.out.println();
			}
			
			// If it is only a scalene triangle, tell the user
			if (isScaleneTriangle && !isRightTriangle){
				System.out.println();
				System.out.println("This is a scalene triangle!");
				System.out.println();
			}
			
			// If it is an equilateral triangle, tell the user
			if (isEquilateralTriangle){
				System.out.println();
				System.out.println("This is an equilateral triangle!");
				System.out.println();
			}
			
		}else{
			
			// Tell the user their input does not make a valid triangle
			System.out.println("Not a valid triangle!");
		}
		
		
	}
}