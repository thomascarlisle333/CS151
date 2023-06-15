public class CalcTimeToHalvePopulation {

   public static void main (String[] args) {
	   
	   final double InitialMexPop = 62000000;
	   final double InitialUSAPop = 280000000;
	   double yearlyMexPop, yearlyUSAPop;
	   int t = 0;
	   
	   yearlyMexPop = InitialMexPop;
	   yearlyUSAPop = InitialUSAPop;
	   
	   System.out.println(); 
	   
	   while (yearlyMexPop <= 0.5*yearlyUSAPop){
		   
		   yearlyMexPop = InitialMexPop*Math.pow((1+0.07),t);
		   yearlyUSAPop = InitialUSAPop*Math.pow((1+0.02),t);
		   System.out.println("The Mexican population after " + t + " years is " + yearlyMexPop + " people, and the US population is " + yearlyUSAPop + " people.");
		   System.out.println();
		   t++;

	   }
	   
	   System.out.println();
	   System.out.println("It will take Mexico " + --t + " years to reach more than half of the US population!");
	   System.out.println();
	   
   }
}
		   
	   
	   