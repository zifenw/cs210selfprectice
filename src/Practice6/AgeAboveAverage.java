package Practice6;

import java.io.*;
import java.util.*;

public class AgeAboveAverage {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner txtinput = new Scanner(new File("student.txt")); 
		Scanner input = new Scanner(System.in);
		System.out.println("How many students?");
		int num = input.nextInt();
		
		String [] name = new String[num];
		String [] gender = new String[num];
		int [] age = new int[num];
		int sum = 0;
		for (int i = 0; i < num; i++) {
			name[i] = txtinput.next();
			gender[i] = txtinput.next();
			age[i] = txtinput.nextInt();
			sum += age[i];
			System.out.println(name[i] + " " + gender[i] + " " + age[i]);
		}
		double average = (double)sum / num;
		
		System.out.println("-------------");
		System.out.printf("Average age = %.1f\n", average);
		int count = 0;
		for (int i = 0; i < num; i++) {
			if (age[i] > average) {
				System.out.println(name[i] + " " + gender[i] + " " + age[i]);
				count++;
			}
		}
		System.out.println(count + "students above the average.");
	}

}
