package Practice5;

import java.util.*;

public class exam2plus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input new ID:");
		String newID = input.next();
		if(lengthcheck(newID) && lettercheck(newID) && numbercheck(newID) && samecheck(newID)){
			System.out.printf("Congratulations! %s is created successfully.", newID);
		}else {
			System.out.printf("%s is invalid.", newID);
		}
	}
	// a method to check the length
	public static boolean lengthcheck(String newID) {
		return(newID.length() >= 4 && newID.length() <= 7);
	}
	// a method to check letter
	public static boolean lettercheck(String newID) {
		return (Character.isLetter(newID.charAt(0)));
		//int firstchar = newID.charAt(0);
		//return (Character.isLetter(firstchar));
		//char firstchar = newID.charAt(0);
		//return((firstchar >= 65 && firstchar <= 90) ||(firstchar >=97 && firstchar <= 122));
		//return((firstchar >= 'a' && firstchar <= 'z') ||(firstchar >='A' && firstchar <= 'Z'));
	}
	// a method to check number
	public static boolean numbercheck(String newID) {
		for (int i = 0; i < newID.length(); i++) {
			//int numChar = newID.charAt(i);
			if (Character.isDigit(newID.charAt(i))) {
			//if (Character.isDigit(numChar)/*numChar >= 48 && numChar <= 57*/) {
				return true;
			}
		}                        
		return false;
	}
	// a method to check first/last character
	public static boolean samecheck(String newID) {
		return(newID.charAt(0) == newID.charAt(newID.length() - 1));
		//int fChar = newID.charAt(0);
		//int lChar = newID.charAt(newID.length() - 1);
		//return(fChar == lChar);

	}

}
