import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
	
	final static byte MONTH_IN_YEAR = 12;
	final static byte PERCENTAGE = 100;
	
	public static void main(String[] args) {
		int loan = (int) getNumber("Number of loan: ", 999, 1000000);
		float aPR = (float) getNumber("Number of Annual Interest: ", 0, 30);
		byte term = (byte) getNumber("Number of term(Years): ", 0, 30);
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		double mortgage = findMortgage(loan, aPR, term);
		String result = currency.format(mortgage);
		
		System.out.println("-------------------------------");
		System.out.println("Monthly Payments is " + result);
		System.out.println("Payment Schedule");
		System.out.println("-------------------------------");
		findMonthlyPayment(loan, aPR, term);
	}
	
	public static double getNumber(String prompt, int min, int max) {
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
	
	public static double findMortgage(int loan, float aPR, byte term) {		
		float monthAPR = aPR / (MONTH_IN_YEAR * PERCENTAGE);
		int termM = term * MONTH_IN_YEAR;
		
		double mortGage = loan * (monthAPR * Math.pow((1+monthAPR), termM) / (Math.pow((1+monthAPR), termM)-1));
		
		return mortGage;
	}
	
	public static void findMonthlyPayment(int loan, float aPR, byte term) {	
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
}