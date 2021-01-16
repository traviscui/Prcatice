import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {
		final byte MONTH_IN_YEAR = 12;
		final byte PERCENTAGE = 100;
		Scanner scanner = new Scanner(System.in);
		int loanValue = 0;
		float aPRValue = 0;
		byte termValue = 0;
		
		while (true) {
			System.out.print("Total loan: ");
			loanValue = scanner.nextInt();
			if (loanValue < 1000 || loanValue > 1000000) {
				System.out.println("Enter a number between 1,000 and 1,000,000.");
				continue;
			}
			else 
				break;
		} 
		
		int loan = loanValue;
		
		while (true) {
			System.out.print("Annual Interest Rate: ");
			aPRValue = scanner.nextFloat();
			if (aPRValue <= 0 || aPRValue > 30) {
				System.out.println("Enter a number greater than 0 and less or equal to 30.");
				continue;
			}
			else 
				break;
		}
		
		float aPR = aPRValue;
		
		while (true) {
			System.out.print("Terms of loan(Years): ");
			termValue = scanner.nextByte();
			if (termValue < 1 || termValue > 30) {
				System.out.println("Enter a value between 1 and 30.");
				continue;
			}
			else
				break;
		}
		
		byte term = termValue;
		
		float monthAPR = aPR / (MONTH_IN_YEAR * PERCENTAGE);
		int termM = term * MONTH_IN_YEAR;
		
		double mortGage = loan * (monthAPR * Math.pow((1+monthAPR), termM) / (Math.pow((1+monthAPR), termM)-1));
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(mortGage);
		
		System.out.println("Mortgage is " + result);
	}

}
