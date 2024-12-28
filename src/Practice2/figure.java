package Practice2;

public class figure {

	public static void main(String[] args) {
		System.out.println("+----+");
		
		for(int i=1;i<4;i++) {
			System.out.println("\\    /");
			System.out.println("/    \\");
		}
		
		System.out.println("+----+");
		
		int highTemp=5;
		for(int i=-3;i<=highTemp/2;i++) {
			System.out.println(i*1.8+32);
		}
		for(int i=1;i<=10;i++) {
			System.out.print(i+",");
		}
		for(int i=10;i>=1;i--) {
			System.out.print(i+",");
		}
		System.out.println("");
		//Print 10 '*' and one Enter key five times
		for(int i=1;i<=5;i++) {         //for(int line = 1; line <= 5;i++)
			for(int j=1;j<=10;j++) {    //for(int star = 1; star <= 10;i++)
				System.out.print("*"); 
			}
			System.out.println("");  //The function of the Enter key
		}
		System.out.println("");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		for (int i=1;i<=5;i++) {
			System.out.println(i);
		}
	  //System.out.println(i); Out of Block Scope so will cause error
	}

}
