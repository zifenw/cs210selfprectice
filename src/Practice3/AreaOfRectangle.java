package Practice3;

public class AreaOfRectangle {

	public static void main(String[] args) {
		int Width = 10;
	    int Height= 5;

	    int aRec = rectArea(Width, Height);
	    System.out.println(aRec);
	}

	public static int rectArea(int w, int h) {
	    int result = w * h;
	    return result;
	}

}
