import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Total loan: ");
		int loan = scanner1.nextInt();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Annual Interest Rate: ");
		float aPR = scanner2.nextFloat();
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.print("Terms of loan(Years): ");
		byte term = scanner3.nextByte();
		
		float monthAPR = aPR / 1200;
		int termM = term * 12;
		double mortGage = loan * (monthAPR * Math.pow((1+monthAPR), termM) / (Math.pow((1+monthAPR), termM)-1));
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(mortGage);
		System.out.println("Mortgage is " + result);
	}

}
