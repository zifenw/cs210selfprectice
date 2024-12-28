package Practice1;

public class FiguresWithMethods {

	public static void main(String[] args) {
		egg();
		cup();
		stopsign();
		hat();
	}
	
	public static void egg() {
		eggtop();
		eggbottom();
		System.out.println();
	}
	public static void cup() {
		eggbottom();
		line();
		System.out.println();
	}
	public static void stopsign() {
		eggtop();
		System.out.println("|  stop  |");
		eggbottom();
		System.out.println();
	}
	public static void hat() {
		eggtop();
		line();
	}
	public static void eggtop() {
		System.out.println("  ______   ");	
		System.out.println(" /      \\");
		System.out.println("/        \\");
	}
	public static void eggbottom() {
		System.out.println("\\        /");
		System.out.println(" \\______/  ");
	}
	public static void line() {
		System.out.println("+--------+");
	}
}
