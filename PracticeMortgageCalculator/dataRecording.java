package PracticeMortgageCalculator;

import java.util.Scanner;

public class dataRecording {
	public double value;
	
	public dataRecording(String prompt, int min, int max) {
		this.value = getNumber(prompt, min, max);
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
}
