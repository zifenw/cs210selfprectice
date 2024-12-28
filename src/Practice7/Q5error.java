package Practice7;



public class Q5error {

	public static void main(String[] args) {
		int x = 1; double y = 1.0, z = 2.0;
		y = A(z,y); //x=1, y=3.0 z= 
		z = A(x,(int)y);
		System.out.println(x+" "+y+" "+z);
		
		x = 1; y = 1.0; z = 2.0;
		y = A((double)x,z);
		z = A(x,y);
		System.out.println(x+" "+y+" "+z);

	}
	public static int A(int x,int y) {
		return x + y;
	}
	public static double A(double x, double y) {
		return x + y;
	}
}
