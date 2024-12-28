package Practice3;

import java.util.*;

public class CircleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter raidus");
		int radius = input.nextInt();
		
		double aCircle =cirCleArea(radius);
		System.out.println("radius = " + radius);
		System.out.println("area = "+ aCircle);
		
		input.close();
	}
	public static double cirCleArea(int r) {
		double result = r * r * 3.12159;
		return result;
		
	}
}
