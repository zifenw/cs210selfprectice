package Practice1;

public class Rocket {

	public static void main(String[] args) {
		triangle();
		square();
		System.out.println("|  969  |");
		square();
		triangle();

	}
	public static void triangle(){
		System.out.println("   /|\\");
		System.out.println("  / | \\");
		System.out.println(" /  |  \\");

	}
	public static void square() {
		System.out.println("+-------+");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("+-------+");
	}
}
