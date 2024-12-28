package Practice3;

public class ParameterMystery {

	public static void main(String[] args) {
		int x = 9;
		String y = "x";
		int z = 2;
		
		mystery(x,y,z);   //(9,"x",2) (10,"x",1) "x 1 10"
		System.out.println(x + " " + y + " " + z); // "9 x 2"
		mystery(z, "y", x); //(2,"y",9) (3,"y",8) "y 8 3"
		mystery(x + 3, y + z, x + z); //(12,"x2",11) (13,"x2",10) (x2 10 13)
	}
	
	public static void mystery(int x, String z, int y) {
		x++;
		y--;
		System.out.println(z + " " + y + " " + x);
	}
}
