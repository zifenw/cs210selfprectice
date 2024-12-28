package Practice3;

public class DoubleParameter {

	public static void main(String[] args) {
		drawStars(3,"$");
		drawStars(5,"%");
		drawStars(3,"#");
		multi(6,7);
		add(5,10);
		int result = addition(5,10);
		System.out.println(result);
		String she = "it";
        String it = "her";
        String her = "you";
        saying(it, her, she); //(her, you, it)          
        
	}
	public static void drawStars(int howMany, String symbol) {
		for (int i = 1; i <= howMany; i++) {
			System.out.print(symbol);
		}
		System.out.println();
	}
	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
	}
	public static int addition(int a, int b) {
		int sum =a + b;
		return sum;
	}
	public static void multi(int a, int b) {
		int times = a * b;
		System.out.println(a + " * " + b +" = " + times);
	}
	public static void saying(String it, String her, String she) {
	    System.out.println(she + " can't take " + it + " with " + her);
	  }

}
