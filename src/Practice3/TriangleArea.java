package Practice3;

import java.util.*;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter side length");
		Double length = input.nextDouble();
		System.out.println("Enter height of the side");
		Double height = input.nextDouble();
		
		System.out.println(Area(length,height));
		input.close();
		
	}
	public static String Area(double L, double H) {
		Double area = L * H / 2;
		return "The area of the triangle is " + area;	
	}
}
