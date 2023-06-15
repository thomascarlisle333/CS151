

public class Triangle{
	
	private int a, b, c;

	public Triangle(int a, int b, int c){
		
		// set argument variables equal to internal class variables
		this.a = a;
		this.b = b;
		this.c = c;
	}	

	// isValidTriangle() method determines whether the input sides make a valid triangle, returning a bool
	public boolean isValidTriangle(){
		
		boolean isValidTriangle = false;
		
		if (a+b > c && a+c > b && b+c > a){
			isValidTriangle = true;
		}
		
		return isValidTriangle;
	}

	// isRightTriangle() method determines whether the input sides make a right triangle, returning a bool
	public boolean isRightTriangle(){
		
		// Declare necessary variables
		int max = Integer.MIN_VALUE;
		final double TOLERANCE = 0.0000001;
		int side1 = 0;
		int side2 = 0;
		boolean isRightTriangle = false;
		
		// Determine the value of the potential hypotenuse by finding the largest side length
		max = Math.max(Math.max(a,b),c);
		
		// If the potential hypotenuse is not equal to another input side, assign side1 and side2 
		if (Math.max(a,b) != c){ 
		
			if (max == a){
				side1 = b;
				side2 = c;
			} 
		
			if (max == b) {
				side1 = a;
				side2 = c;
			} 
		
			if (max == c) {
				side1 = a;
				side2 = b;
			}
			
		}else {
			// assignment does not matter, because pythagoreom theorem will never be true
			side1 = a;
			side2 = b;
			max = c; 
			isRightTriangle = false;
		}
		
		// obtain the pieces of a^2 + b^2 = c^2 to, I recognize sqrt function was not necessary, but I wanted to try comparing doubles
		int maxSquared = max*max;
		double sqrtMaxSquared = Math.sqrt(maxSquared);
		int sidesSquared = side1*side1 + side2*side2;
		double sqrtSidesSquared = Math.sqrt(sidesSquared);
		
		// if the potential hypotenuse squared is within a negligible tolerance of the sum of the sides squared, return true
		if (Math.abs(sqrtMaxSquared - sqrtSidesSquared)<TOLERANCE){
			isRightTriangle = true;
		}else{
			isRightTriangle = false;
		}
		
		return isRightTriangle;
	}		

	// isIsoscelesTriangle() method determines whether the input sides make an isosceles triangle, returning a bool
	public boolean isIsoscelesTriangle(){
		
		boolean isIsosceles = false;
		
		//check to make sure only two sides are equal
		if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)){
			
			isIsosceles = true;
		}
		
		return isIsosceles;
	}

	// isScaleneTriangle() method determines whether the input sides make a scalene triangle, returning a bool
	public boolean isScaleneTriangle(){
		
		boolean isScaleneTriangle = false;
		
		// check to make sure no sides are equal
		if ((a != b) && (a != c) && (b != c)){
			
			isScaleneTriangle = true;
		}
		
		return isScaleneTriangle;
	}

	// isEquilateralTriangle() method determines whether the input sides make an equilateral triangle, returning a bool
	public boolean isEquilateralTriangle(){
		
		boolean isEquilateralTriangle = false;
		
		// check to make sure all sides are equal
		if ((a == b) && (a == c) && (b == c)){
			
			isEquilateralTriangle = true;
		}
		
		return isEquilateralTriangle;
	}
}