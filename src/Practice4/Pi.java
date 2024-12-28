package Practice4;

public class Pi {

	public static void main(String[] args) {
		//use for loop and round
		double pi = 3.14159265359;
		double j = 1.0;
		for(int i = 1; i <= 4; i++) {
			j*=10;	
			System.out.println(Math.round(pi * j)/j);
		}
		
		j=1.0;
		for(int i = 1; i <= 4; i++) {
			j*= 10.0;
			for(int k = 3; k >= i; k--) {
				System.out.print(" ");	
			}
			System.out.println(Math.round(pi * j)/j);
		}
		//method1 ended
		
		System.out.println();
		
		//Use println-method
		System.out.println((Math.round(pi * 10)) / 10.0);
		System.out.println((Math.round(pi * 100)) / 100.0);
		System.out.println((Math.round(pi * 1000)) / 1000.0);
		System.out.println((Math.round(pi * 10000)) / 10000.0);
		
		System.out.println(("   " + (Math.round(pi * 10)) / 10.0));
		System.out.println(("  " + (Math.round(pi * 100)) / 100.0));
		System.out.println((" " + (Math.round(pi * 1000)) / 1000.0));
		System.out.println(((Math.round(pi * 10000)) / 10000.0));
		
		//method2 ended
		
		System.out.println();
		
		//Use Formatting text with printf-method 
		for (int i = 1; i<= 4; i++) {
			System.out.printf("%-6." + i + "f\n", pi);
		}
		for (int i = 1; i <=4; i++) {
			System.out.printf("%6." + i + "f\n", pi);
		}
		//method3 ended
		
		System.out.println();
		
		//Formatting text Practice
		for (int i = 1; i <=4; i++) {
			System.out.printf("%" + i + "d\n",i);
		}
			
		int year = 2021;
		String course = "CS210";
		
		System.out.printf("Result is %d\n", year); //Result is 2021; %d: int-variable \n: next line
		System.out.printf("Result is %7d%7d\n", year, year); //Result is    2021   2021; %7d: 7 wide right-aligned
		System.out.printf("Result is %-7d%-7d\n", year, year); //Result is 2021   2021   ;%-7d: 7 wide left-aligned 
		
		System.out.printf("Result is %f\n", pi); //Result is 3.141593; %f: double-variable 6 digits after decimal  
		System.out.printf("Result is %10f%10f\n", pi, pi); //Result is   3.141593  3.141593; %10f: 10 wide right-aligned decimal should be one wide
		System.out.printf("Result is %-10f%-10f\n", pi, pi); //Result is 3.141593  3.141593  ;
		System.out.printf("Result is %10.2f%10.2f\n", pi, pi); //Result is       3.14      3.14; %10.2f after decimal rounded to D + 10 wide + right-aligned
		System.out.printf("Result is %-10.2f%-10.2f\n", pi, pi);//Result is 3.14      3.14      ;
		
		System.out.printf("Result is %s\n", course); //Result is CS210;
		System.out.printf("Result is %7s%7s\n", course, course); //Result is   CS210  CS210;
		System.out.printf("Result is %-7s%-7s\n", course, course); //Result is CS210  CS210  ;
		System.out.printf("Result is %3s%3s\n", course, course); //Result is not CS2CS2; Result is CS210CS210; WIDE LESS THAN LENGTH WILL PRINT LENGTH NOT THE WIDE
		
		
			
		
		
		
	}
	

}
