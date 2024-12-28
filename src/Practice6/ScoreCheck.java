package Practice6;

import java.io.*;
import java.util.Scanner;

/*Zifeng Wang
202515718
11/2/2023
This program to check the data that find out the students whose grade is above the average. 
I use the while loop and Arrays class.*/

public class ScoreCheck {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner txtinput = new Scanner(new File("score.txt")); 
		String [] name = new String[6];
		int [] math = new int[6];
		int [] physics = new int[6];
		
		Scanner input = new Scanner(System.in);
		int choice = 0;
		do {
		System.out.println("Select a subject 1.Math 2.Pysics(Type 1 or 2)");
		choice = input.nextInt();
		}while(choice != 1 && choice != 2);
		
		int studentN = 0; int mathSum = 0; int physicsSum = 0; 
		while(txtinput.hasNext()){
			name[studentN] = txtinput.next();
			math[studentN] = txtinput.nextInt();
			physics [studentN] = txtinput.nextInt();
			mathSum += math[studentN];
			physicsSum += physics [studentN];
			studentN++;	
		}
		double mAverage = (double)mathSum / studentN;
		double pAverage = (double)physicsSum / studentN;
		
		System.out.println("Name  Math  Physics");
		System.out.println("-------------------");
		
		
		if (choice == 1) {
			for (int i = 0; i < studentN; i++) {
				if (math[i] > mAverage) {
					System.out.println(name[i] + " " + math[i] + " " + physics[i]);
				}
			}
			System.out.printf("Average of Math = %.1f", mAverage);
		}else {
			for (int i = 0; i < studentN; i++) {
				if (physics[i] > pAverage) {
					System.out.println(name[i] + " " + math[i] + " " + physics[i]);
				}
			}
			System.out.printf("Average of Physics = %.1f", pAverage);
		}
	}

}
