package Practice6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class arrayList {
	
	public static ArrayList<String> name = new ArrayList<>();
	public static ArrayList<String> gender = new ArrayList<>();
	public static ArrayList<Integer> age = new ArrayList<>();
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("student.txt"));
		
		while (input.hasNext()) {
			name.add(input.next());
			gender.add(input.next());
			age.add(input.nextInt());
		}
		
		PrintResult();
	}
	public static void PrintResult() {
		int sum = 0;
		for(int j = 0; j < age.size(); j++) {
			sum += age.get(j);
		}
		double average = (double)sum / age.size() ;
		for (int i = 0; i < age.size(); i++) {
			if (age.get(i) > average) {
				System.out.println(name.get(i) + " " + gender.get(i) + " " + age.get(i));
			}
		}
	}
	

}
