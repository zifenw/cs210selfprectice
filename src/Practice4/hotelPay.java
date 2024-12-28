package Practice4;

import java.util.*;

public class hotelPay {

	public static void main(String[] args) {
		System.out.println("This program computes the total charge of the hotel stay.");
		Scanner input = new Scanner(System.in);
		
		System.out.println(hotelFee(input));

	}
	
	public static String hotelFee(Scanner input) {
		
		System.out.println("What type of customer you are?(AAA, senior, regular)");
		String type = input.next();
		System.out.println("number of rooms?");
		int roomN = input.nextInt();
		System.out.println("number of nights?");
		int nightN = input.nextInt();
		System.out.println("guests per room?");
		int guestN = input.nextInt();
		
		double base = 99.75; // for regular
		if (type.equals("AAA")) {
			base = 89.75;
		} else if (type.equals("senior")) {
			base = 94.75;
		} 
		if (guestN > 2) { 
			base += (guestN - 2) * 10;
		}
		double fee = roomN * nightN * base;
		return "Total chare will be $" + fee;
	}

}
