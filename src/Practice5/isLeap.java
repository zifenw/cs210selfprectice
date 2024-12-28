package Practice5;

import java.util.*;

public class isLeap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a year number:");
		int year = input.nextInt();
		System.out.println("isLeep(" + year + ") returns " + isLeap(year));
	}
	/*
		if(fourDivision(year) && !hundredDivision(year)) {
			System.out.println(true);
		}else if(fourhundredDivision(year)){
			System.out.println(true);
		}else {
			System.out.println(false);
		}*/
	public static boolean isLeap(int year) {
		return(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}
	/*	return(fourDivision(year) && !hundredDivision(year) || fourhundredDivision(year));
	}
	public static boolean fourDivision(int year) {
		return(year % 4 == 0);
	}
	public static boolean hundredDivision(int year) {
		return(year % 100 == 0);
	}
	public static boolean fourhundredDivision(int year) {
		return(year % 400 == 0);
	}*/
}
