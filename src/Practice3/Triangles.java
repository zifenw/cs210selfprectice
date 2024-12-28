package Practice3;

import java.util.*;

public class Triangles {

	public static void main(String[] args) {
		Scanner triangleSize = new Scanner(System.in);
		System.out.print("Triangle size?");
		int line = triangleSize.nextInt();
		DrawWithForLoop(line);
		drawTrangle(line);
		
		triangleSize.close();
	}
	public static void DrawWithForLoop(int line) {
		for(int i = 1; i <= line; i++) { 
			for(int space = line; space >= i; space--) {
				System.out.print(" ");	
			}
			
			for(int stars = 1; stars <= 2 * i - 1; stars++) {
				System.out.print("*");
			}
			
			System.out.println();	
		}
	}
	public static void drawTrangle(int line){
		for (int i = 1; i <= line; i++) {
			printString(" ", -1 * i + line + 1);
			printString("*", 2 * i - 1);
			System.out.println();
		}
	}
	public static void printString(String s, int times) {
		for(int i = 1; i <= times; i++) {
			System.out.print(s);
		}
	}
	
	

}
