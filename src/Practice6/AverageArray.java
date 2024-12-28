package Practice6;

import java.io.*;
import java.util.*;

public class AverageArray {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("student.txt")); 
		String [] name = new String[6];
		String [] gender = new String[6];
		int [] age = new int[6];
		
		
		int No_of_students = 0; int sum = 0;
		while(input.hasNext()){
			name[No_of_students] = input.next();
			gender[No_of_students] = input.next();
			age [No_of_students] = input.nextInt();
			System.out.println(name[No_of_students] + " " + gender[No_of_students] + " " + age[No_of_students]);
			sum += age[No_of_students];
			No_of_students++;
		}
		double average = (double)sum / No_of_students;
		
		System.out.println("-------------");
		System.out.printf("Average age = %.1f\n\n", average);
		int count = 0;
		for (int i = 0; i < No_of_students; i++) {
			if (age[i] > average) {
				System.out.println(name[i] + " " + gender[i] + " " + age[i]);
				count++;
			}
		}
		System.out.println(count + " students above the average.");

	}

}
