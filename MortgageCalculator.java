import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {
		final byte MONTH_IN_YEAR = 12;
		final byte PERCENTAGE = 100;
		Scanner scanner = new Scanner(System.in);
		int loan = 0;
		float aPR = 0;
		byte term = 0;
		
		while (true) {
			System.out.print("Total loan: ");
			loan = scanner.nextInt();
			if (loan < 1000 || loan > 1000000) {
				System.out.println("Enter a number between 1,000 and 1,000,000.");
				continue;
			}
			else 
				break;
		} 
		
		while (true) {
			System.out.print("Annual Interest Rate: ");
			aPR = scanner.nextFloat();
			if (aPR <= 0 || aPR > 30) {
				System.out.println("Enter a number greater than 0 and less or equal to 30.");
				continue;
			}
			else 
				break;
		}
		
		while (true) {
			System.out.print("Terms of loan(Years): ");
			term = scanner.nextByte();
			if (term < 1 || term > 30) {
				System.out.println("Enter a value between 1 and 30.");
				continue;
			}
			else
				break;
		}
		
		float monthAPR = aPR / (MONTH_IN_YEAR * PERCENTAGE);
		int termM = term * MONTH_IN_YEAR;
		
		double mortGage = loan * (monthAPR * Math.pow((1+monthAPR), termM) / (Math.pow((1+monthAPR), termM)-1));
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(mortGage);
		
		System.out.println("Mortgage is " + result);
	}

}
