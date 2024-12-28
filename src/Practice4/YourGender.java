package Practice4;

import java.util.*;

public class YourGender {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("What's your gender?");
		String gender = console.next();
		
		gender = gender.toUpperCase();
		
		if(gender.length() ==1) {
			if (gender.equals("F")) {
				System.out.println("You are a girl.");
			} else if (gender.equals("M")) {
				System.out.println("You are a boy.");
			} else {
				System.out.println("You are a robot");
			}
		}
		if(gender.length()>1) {
			if(gender.equals("FEMALE")) {
				System.out.println("You are a girl");
			} else if (gender.equals("MALE")) {
				System.out.println("You are a boy");
			} else {
				System.out.println("You are a robot.");
			} 
		}
	}

}
