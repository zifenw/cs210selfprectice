package Practice4;

import java.util.*;

public class primeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Maximum number?");
		int max = input.nextInt();
		int primeN = 0;
		for (int i = 1; i<= max; i++) {
			if (countFactors(i) == 2) {
				primeN++;
				System.out.print(i + " ");
			}
		}
		double percent = primeN * 100.0 / max;
		System.out.printf("\n%d primes (%.2f%%)", primeN, percent);
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
