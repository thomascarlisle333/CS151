import java.text.*;

public class ConvUSDtoEuro{
	public static void main(String[] args){
		
		final float ConvFactor = 1.05f;
		float USD = 10, Euro;
		
		
		NumberFormat dollars = NumberFormat.getCurrencyInstance();
		DecimalFormat deci = new DecimalFormat("#.00");
		
		System.out.println("Dollars\t\tEuros");
		
		while (USD<=100){
			Euro = USD*ConvFactor;
			System.out.println(dollars.format(USD) + "\t\t€" + deci.format(Euro));
			USD +=10;
		}
	}
}
		
		