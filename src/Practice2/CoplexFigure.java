package Practice2;

public class CoplexFigure {

	public static void main(String[] args) {
		for(int line = 1; line <= 5; line++) {
			//print (-4*line + 20)slashes /
			for(int slash = 1; slash <= (-4 * line + 20); slash++) {
				System.out.print("/");
			}
			
			//print (8*line-8)stars *
			for(int star = 1; star <= (8 * line - 8); star++) {
				System.out.print("*");
			}
			
			//print (-4*line+20)backslashes \
			for(int backslash = 1; backslash <= (-4 * line + 20); backslash++) {
				System.out.print("\\");
			}
			
			System.out.println();
		}
		
	}

}
