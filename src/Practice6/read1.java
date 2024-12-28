package Practice6;

import java.io.*;
import java.util.Scanner;

public class read1 {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("student.txt"));
		PrintStream out = new PrintStream(new File("output.txt"));
		
		while (input.hasNext()) {
			String name = input.next();
			String gender = input.next();
			int age = input.nextInt();
			/*System.*/out.println(name + " " + gender + " " + age);
		}
	}

}
