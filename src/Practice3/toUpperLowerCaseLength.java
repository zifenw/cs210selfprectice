package Practice3;

public class toUpperLowerCaseLength {

	public static void main(String[] args) {
		String originalString1 = "Hello, World!";
        String lowercaseString = originalString1.toLowerCase();
        System.out.println("Original String: " + originalString1);
        System.out.println("Lowercase String: " + lowercaseString);
        
        String originalString2 = "Hello, World!";
        String uppercaseString = originalString2.toUpperCase();
        System.out.println("Original String: " + originalString2);
        System.out.println("Uppercase String: " + uppercaseString);      
        
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Length of the string is: " + length);
	}

}
