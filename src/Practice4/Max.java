package Practice4;


public class Max {

	public static void main(String[] args) {
		System.out.println(max(5,10,15));

	}
	public static int max(int a,int b,int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b > a && b >= c){
			return b;
		} else {
			return c;
		}
	}
}
