package Practice2;

public class ArithmeticOperators {

	public static void main(String[] args) {		
//Integer remainder with /		
		System.out.println(1/2);
		System.out.println(2/1);
	    System.out.println(0/2);
		System.out.println(9/3);
		System.out.println(10/3);
		System.out.println(11/3);
//Integer remainder with %
		System.out.println(1%2);
		System.out.println(2%1);
		System.out.println(0%2);
		System.out.println(9%3);
	    System.out.println(10%3);
		System.out.println(11%3);
//Find average of 1,3,4
		System.out.println(8/3);
		System.out.println(8/3.0);
//Use + between a string and another value
		System.out.println("Grade:"+(95.1+71.9)/2);
/*Practice
4;19;-16;3;9.0;7CS 210;CS 2108;11.0;2.0;10.5;2+4;6
*/
		//2+2+"2"+2+4
		System.out.println(2+2+"2"+2+2*2);
		/*from left to right!!! 
		 * 4+"2"+2+4
		 * "42"+2+4
		 * "422"+4
		 * "4224"
		 * */		
		for(int i = 0; i <= 9; i++) {
			for(int j = 0; j <= 9; j++) {
				System.out.print("" + i + j +",");
			}
			System.out.println();
		}
		for(int i = 1; i<=100; i+=2) {
			System.out.print(i+",");
		}
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j <= 10 * i; j+=2) {
				System.out.print(j+",");
			}
			System.out.println();
		}
		for(int i=1;i<10;i++) {
			for(int j=1; j<i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
		System.out.println();
		}
		for(int i = 0; i<=9; i++) {
			for(int j = 1; j<= 5;j++) {
				System.out.print(5*i+j+",");
			}
			System.out.println();
			/* 1,2,3,4,5   0*5+1 0*5+2 0*5+3 0*5+4 0*5+5
			 * 6,7,8,9,10  1*5+1 1*5+2
			 * 
			 * */
		}
	}

}
