package Practice6;


/*Zifeng Wang
202515718
11/3/2023
This program to check the index of a Array. 
I use the for loop and Arrays class.*/


public class findIndex {

	public static void main(String[] args) {
		int[] my_array = new int[]{25, 10, 55, 65, 36, 92, 77, 8, 13, 79}; 
	      System.out.println("Index position of 55 is: " + findIndex(my_array, 55)); 
	      System.out.println("Index position of 13 is: " + findIndex(my_array, 13)); 

	}
	public static int  findIndex (int[] my_array, int t) { 
		 for (int i = 0; i < my_array.length; i++ ) {
			 if (my_array[i] == t) {
				 return i;
			 }
		 }
		 return -1;
     }  

}
