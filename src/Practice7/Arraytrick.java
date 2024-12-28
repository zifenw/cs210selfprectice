package Practice7;

import java.util.*;
public class Arraytrick {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = a;
		int[] c = a;
		System.out.println(Arrays.toString(a));
		b[0] = 4;
		System.out.println(Arrays.toString(b));
		c[0] = 5;
		System.out.println(Arrays.toString(c));
	}

}
