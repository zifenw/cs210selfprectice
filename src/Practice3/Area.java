package Practice3;

import java.util.*;

public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Width");
		int Width = input.nextInt();
		
		System.out.println("Enter Height");
		int Height = input.nextInt();
		
		int aRec = rectArea(Width, Height);
		System.out.println(aRec);
		
		input.close();

	}
	public static int rectArea(int w, int h) {
		int result = w * h;
		return result;
	}

}
