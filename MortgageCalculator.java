import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {
		final byte MONTH_IN_YEAR = 12;
		final byte PERCENTAGE = 100;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Total loan: ");
		int loan = scanner.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		float aPR = scanner.nextFloat();
		
		System.out.print("Terms of loan(Years): ");
		byte term = scanner.nextByte();
		
		float monthAPR = aPR / (MONTH_IN_YEAR * PERCENTAGE);
		int termM = term * MONTH_IN_YEAR;
		
		double mortGage = loan * (monthAPR * Math.pow((1+monthAPR), termM) / (Math.pow((1+monthAPR), termM)-1));
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(mortGage);
		
		System.out.println("Mortgage is " + result);
	}

}
