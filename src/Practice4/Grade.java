package Practice4;

import java.util.*;

public class Grade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What the percentage did you earn?");
		double percent = input.nextDouble();

		System.out.println(determine(percent));
		System.out.println("Thanks for using Grade-It 3000.");
	}
	public static String determine(double percent){
		if (percent >= 90) {
			return "You got an A!";
		} else if (percent >= 80) {
			return "You got a B!";
		} else if (percent >= 70) {
			return "You got a C!";
		} else if (percent >= 60) {
			return "You got a D!";
		} else {
			return "You got an F!";
		}
		
	}
		

}
