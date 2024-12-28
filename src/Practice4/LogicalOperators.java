package Practice4;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;

		if (a == b) {
			 System.out.println("a and b are the same.");
			} else{
			System.out.println("a and b are NOT the same.");
			}

		if ((b > a) || (a > c)){
			 System.out.println("true");
			} else{
			   System.out.println("false");
			}

		if ((b > a) && (a > c)){
			 System.out.println("true");
			} else{
			   System.out.println("false");
			}

	}

}
