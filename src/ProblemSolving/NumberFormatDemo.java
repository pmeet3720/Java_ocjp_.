package ProblemSolving;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
	
	public static void main(String[] args) {
		double n = 12324.134;
		
		NumberFormat nUS = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nUS.format(n));
		
		NumberFormat nIndia = NumberFormat.getCurrencyInstance();
		System.out.println(nIndia.format(n));
		
		NumberFormat nFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(nFrance.format(n));
		
		NumberFormat nChine = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(nChine.format(n));
	}

}
