package PracticeMortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class calculateMortgage {
	
	final static byte MONTH_IN_YEAR = 12;
	final static byte PERCENTAGE = 100;
	
	private int loan;
	private float aPR;
	private short term;
	public String mortgage;
	
	public calculateMortgage() {
		var data = new dataRecording("Enter total loan: ", 999, 1000000);
		this.loan = (int)data.value;
		data = new dataRecording("Enter Annual Interest: ", 0, 30);
		this.aPR = (float)data.value;
		data = new dataRecording("Enter Total Terms(Year): ", 0, 30);
		this.term = (short)data.value;
		
		this.mortgage = findMortgage();
		}
	
	private String findMortgage() {
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
		System.out.println("Monthly Payments is ");
		System.out.println("Payment Schedule");
		System.out.println("-------------------------------");
		calculateMonthlyPayment();
	}
}