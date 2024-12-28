package Practice4;

import java.util.*;

public class CountPrimes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type your number:");
		int number =  input.nextInt();
		int count = countFactors(number);
		System.out.println("The number has total " + count + " factor(s).");
	}

	public static int countFactors(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		return count;
	}
}
