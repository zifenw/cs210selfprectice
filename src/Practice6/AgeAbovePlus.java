package Practice6;

import java.io.*;
import java.util.*;
/*Zifeng Wang
202515718
10/31/2023
This program to check the data that find out the students whose age is above the average. 
eliminate the need for counting the number of students by using dynamic data structures like ArrayLists
I use the while loop and Arrays class.*/
public class AgeAbovePlus {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("student.txt")); 
		
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> genders = new ArrayList<>();
		ArrayList<Integer> ages = new ArrayList<>();
		
		while (input.hasNext()) {
		names.add(input.next());
		genders.add(input.next());
		ages.add(input.nextInt());
		}
		
		int num = ages.size();
		int sum = 0;
		for(int age : ages) {
			sum += age;
		}
		
		double average = (double)sum / num;
		System.out.printf("Average age = %.1f\n", average);
		
		int count = 0;
		for (int i = 0; i < num; i++) {
			if (ages.get(i) > average) {
				System.out.println(names.get(i) + " " + genders.get(i) + " " + ages.get(i));
				count++;
			}
		}
		System.out.println(count + "students above the average.");
	}
}
