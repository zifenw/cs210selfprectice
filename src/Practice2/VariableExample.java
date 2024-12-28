package Practice2;

public class VariableExample {

	public static void main(String[] args) {
		int x = 2 + 2;
		int y = 2 * x;
		int z = y - x - 1;
		y--;
		x++;
		System.out.println("x = " + x);	
		System.out.println("y = " + y);	
		System.out.println("z = " + z);
		x *= y;
		x *= z;
		y = x / y / z;
		z = x / y / z;
		x = x / y / z;
		System.out.println("x = " + x);	
		System.out.println("y = " + y);	
		System.out.println("z = " + z);	

	}
		/*x=4; y=8; z=3
		 * y=y-1=7
		 * x=x+1=5
		 * x = 5
		 * y = 7
		 * z = 3
		 * x=x*y=35
		 * x=x*z=105
		 * y=x/y/z=5
		 * z=x/y/z=7
		 * x=x/y/z=3
		 * x = 3
		 * y = 5
		 * z = 7
		 * */
}
