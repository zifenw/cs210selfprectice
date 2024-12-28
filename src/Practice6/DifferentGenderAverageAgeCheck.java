package Practice6;

import java.io.*;
import java.util.*;
/*Zifeng Wang
202515718
10/31/2023
This program to check the data that find out the different gender students' average age. 
I use the while loop and and Scanner.*/
public class DifferentGenderAverageAgeCheck {

	public static void main(String[] args) throws FileNotFoundException{
		String gen = "";
		Scanner txtinput = new Scanner(new File("member.txt"));
		do {
		Scanner input = new Scanner(System.in);
		System.out.println("Input gender (f/m):");
		gen = input.next();
			if(!inputCheck(gen)) {
				System.out.println("Input again");
			}
		}while(!inputCheck(gen));
		if(gen.equals("f")) {
			System.out.println("List of femal students");
		}else {
			System.out.println("List of male students");
		}
		System.out.println("*********************");
		int num = 0;
		int sum = 0;
		while (txtinput.hasNext()) {
			String name = txtinput.next();
			String gender = txtinput.next();
			int age = txtinput.nextInt();
			if (gender.equals(gen)) {
				num++;
				sum += age;
				System.out.println(name + " " + gender + " " + age);
			}
		}
		double average = (double)sum / num;
		if(gen.equals("f")) {
			gen = "female";
		}else {
			gen = "male";
		}
		System.out.printf("There are %d %s students.\n",num, gen);
		System.out.printf("Their average age is %.1f",average);
		
	}
		
	public static boolean inputCheck(String gender) {
		return(gender.equals("f")||gender.equals("m"));
	}
}
