package Practice5;

import java.util.*;

public class randomNumber {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int times = 0;
		int result = 0;
		while (result != 7) {
			int randomN1 = rand.nextInt(6) + 1;
			int randomN2 = rand.nextInt(6) + 1;
			result = randomN1 + randomN2;
			System.out.println(randomN1 + " + " + randomN2 + " = " + result);
			times++;
		}
		System.out.println("You won after " + times + " tries!");
		
		
	}

}
