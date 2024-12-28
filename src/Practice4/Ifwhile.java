package Practice4;

import java.util.*;
public class Ifwhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("type a real number:");
		Double x = input.nextDouble();
		
		System.out.println(identify(x));
	}
	
	public static String identify(double x) {
		if(x < 0) {
	return "negative";
		} else if (x == 0) {
	return "zero";
		} else {
	return "positive";
		} 
	}
}
