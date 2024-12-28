package Practice5;

import java.util.*;

public class exam2 {

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
		/*int length = newID.length();
		if (length >= 4 && length <= 7) {
			return true;
		} else {
			return false;
		}*/
		int length = newID.length();
		return(length >= 4 && length <= 7);
		
	}
	// a method to check letter
	public static boolean lettercheck(String newID) {
		/*int firstchar = newID.charAt(0); 
		if ((firstchar >= 65 && firstchar <= 90) ||(firstchar >=97 && firstchar <= 122)) {
			return true;
		} else {
			return false;
		}*/
		int firstchar = newID.charAt(0);
		return((firstchar >= 65 && firstchar <= 90) ||(firstchar >=97 && firstchar <= 122));
	}
	// a method to check number
	public static boolean numbercheck(String newID) {
		for (int i = 0; i <= newID.length() - 1; i++) {
			int numChar = newID.charAt(i);
			if (numChar <=57 && numChar >=48) {
				return true;
			}
		}
		return false;
		/*for (int i = 0; i <= newID.length() - 1; i++) {
			int numChar = newID.charAt(i);
		}
		return (newID.contain("0" || "1" || "2" || "3" || "4" || "5" || "6" || "7" || "8" || "9"));*/
	}
	// a method to check first/last character
	public static boolean samecheck(String newID) {
		/*int fChar = newID.charAt(0);
		int lChar = newID.charAt(newID.length() - 1);
		if (fChar == lChar) {
			return true;
		} else {
			return false;
		}*/
		int fChar = newID.charAt(0);
		int lChar = newID.charAt(newID.length() - 1);
		return(fChar == lChar);
	}
	
}
