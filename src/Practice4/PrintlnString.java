package Practice4;

public class PrintlnString {

	public static void main(String[] args) {
		String major = "CS210";
		for(int i = 0; i < major.length(); i++) { //no i = length, so for loop cannot reach <= length
			System.out.println(major.charAt(i));
		}
		for(int i = 32; i <= 127; i++) {
			if ((i - 2) % 10 != 0) {
				System.out.print((char)i);
			}else {
				System.out.println();
				System.out.print(i + " ~ " + (i + 9) + " : " + (char)i);
			}
		}
		/*for(int i = 1; i <= 11; i++) {
			System.out.print();
			for(int j = 1; j <= 10; j++) {
				System.out.print((char)(10 * i + 21 + j));
			}
			
		}*/
		System.out.println();
		char c = 'a';
		System.out.println(c + c);
		for (char i = 'a'; i <= 'f'; i++) {
			System.out.println(i + " " + (1 + i));
		}
	}

}
