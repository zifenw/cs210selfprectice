package Practice4;

import java.util.*;

public class LogIn {

	public static void main(String[] args) {
		String myID = "Zifeng Wang";
		String myPWD = "Test1234$";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID ");
		String id = input.nextLine();
		
		System.out.println("Enter PWD ");
		String pwd = input.nextLine();
		
		if (myID.equals(id) && myPWD.equals(pwd)) {
			System.out.println("Welecome. You are logged in.");
		} else {
			System.out.println("Wrong ID or PWD. Input ID and PWD again.");
		}
	}

}
