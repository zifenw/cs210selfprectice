package Practice6;

import java.util.Arrays;
//import java.util.*;
/*Zifeng Wang
202515718
10/31/2023
This program to check the average of a Quick array initialization. 
I use the for loop and Arrays class.*/

public class exAboveAverage {

	public static void main(String[] args) {
		int[] myArray = {1,2,3,3,4,5,6,2};
		int sum = 0;
		int num = 0;
		for (int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
			num++;
		}
		double average = (double)sum / num;
		System.out.printf("%.2f is the average of these %d number\n", average, num);
		System.out.printf("Element > %.2f is\n",average);
		for (int i = 0; i < myArray.length; i++) {
			if(myArray[i] > average) {
				System.out.println(myArray[i]);
			}
		}
		
	}

}
