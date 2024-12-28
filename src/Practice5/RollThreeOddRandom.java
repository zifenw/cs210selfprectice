package Practice5;

import java.util.*;

public class RollThreeOddRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		int odds = 0;
		int rolls = 0;
		int randomN;
		System.out.println("Let's roll some dice!");
		do {          //while (odds < 3){
			randomN = rand.nextInt(6)+ 1;
			rolls++;
			System.out.printf("You rolled a %d\n", randomN);
			if (randomN % 2 == 1) {
				odds++;
			}
		}while(odds != 3);
		System.out.printf("Three in a row after %d rolls.", rolls);
	}
	
}
