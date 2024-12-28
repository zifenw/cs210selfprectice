package Practice5;

public class exam1 {

	public static void main(String[] args) {
		
		System.out.println("What \"character\" does this \\print?");
		
		
		double num = 3;
		for(int i = 0; i < num; i++) {
			if (i < num % 2) {
				num = division(num);
			}
			System.out.println(num);
		} 
	}
	public static double division(double i) {
		return (int) i/2;
	}

}
