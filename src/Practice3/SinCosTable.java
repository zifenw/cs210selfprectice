package Practice3;

public class SinCosTable {

	public static void main(String[] args) {
		table(360,30);
		table(90,10);

	}
	public static void table(int maximum, int increment) {
		System.out.println("n\tsin(n)\tcos(n)");
		int entries = maximum / increment;
		for(int i = 0; i <= entries; i++) {
			int n = i * increment;
			double angle = Math.toRadians(n);
			double sin = round2(Math.sin(angle));
			double cos = round2(Math.cos(angle));
			System.out.println(n + "\t" + sin + "\t" + cos);
		}
		System.out.println();
	}
	public static double round2(double number) {
		return Math.round(number * 100.0) / 100.0; 
	}

}
