package PracticeMortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
	
	final static byte MONTH_IN_YEAR = 12;
	final static byte PERCENTAGE = 100;
	
	private int loan;
	private float aPR;
	private short term;
	
	public Mortgage() {
		this.loan = (int) getNumber("Number of loan: ", 999, 1000000);
		this.aPR = (float) getNumber("Number of Annual Interest: ", 0, 30);
		this.term = (short) getNumber("Number of term(Years): ", 0, 30);
	}
	
	private double getNumber(String prompt, int min, int max) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print(prompt);
			double value = scanner.nextDouble();
			if (value <= min || value > max) {
				System.out.println("Enter a value between " + min + " and " + max);
				continue;
			}
			else
				return value;
	}
	}
	
	private String calculateMortgage() {
		int termM = term * MONTH_IN_YEAR;
		float monthAPR = aPR / (MONTH_IN_YEAR * PERCENTAGE);
		
		double mortgage = loan * (monthAPR * Math.pow((1+monthAPR), termM) / (Math.pow((1+monthAPR), termM)-1));
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(mortgage);
		
		return result;
	}
	
	private void calculateMonthlyPayment() {
		int termM = term * MONTH_IN_YEAR;
		float monthAPR = aPR / (MONTH_IN_YEAR * PERCENTAGE);
		
		short timesPaid = 0;
		
		while (true) {
			double balance = loan * (((Math.pow(1+monthAPR, termM)-Math.pow(1+monthAPR, timesPaid))) / (Math.pow(1+monthAPR, termM)-1));
			timesPaid += 1;
			if (balance < 0) 
				break;
			else{
				NumberFormat currency = NumberFormat.getCurrencyInstance();
				String result = currency.format(balance);
				System.out.println(result);
				continue;
	}
}
	}
	
	public void printResult() {
		System.out.println("-------------------------------");
		System.out.println("Monthly Payments is " + calculateMortgage());
		System.out.println("Payment Schedule");
		System.out.println("-------------------------------");
		calculateMonthlyPayment();
	}
}