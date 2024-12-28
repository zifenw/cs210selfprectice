package Practice3;

public class TypeCasting {

	public static void main(String[] args) {
		double x = 1 + (double) 1 / 2; //1.5 without type casting:1.0
		System.out.println(x); 
		double y = (double)(10 / 3);  //3.0  without type casting:3.0
		System.out.println(y);
		System.out.println(Math.pow(10, 3)); 
		int z = (int)Math.pow(10, 3); //1000 without type casting:error
		System.out.println(z);
		String a="1";
		int i =Integer.valueOf(a);
		System.out.println(i);
	}

}
