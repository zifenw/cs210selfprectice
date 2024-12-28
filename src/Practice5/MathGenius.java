package Practice5;

import java.util.*;

public class MathGenius {

	public static void main(String[] args) {
		Random rand = new Random();
		int first = rand.nextInt(10);
		int second = rand.nextInt(10);
		
		Scanner input = new Scanner(System.in);
		System.out.printf("%d + %d = ?\n", first, second);
		int answer = input.nextInt();
		
		while(answer != first + second) {
			System.out.println("wrong answer!");
		}
		System.out.println("You are a math genius! Bye");

	}

}
