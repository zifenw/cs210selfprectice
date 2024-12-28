package Practice3;

public class Indexof {

	public static void main(String[] args) {
		String mainString = "Hello, World!";
        String substring = "World";
        
        int index = mainString.indexOf(substring);
        
        if (index != -1) {  //is not -1
            System.out.println("Substring '" + substring + "' found at index: " + index);
        } else {
            System.out.println("Substring '" + substring + "' not found in the main string.");
        }
        double i = Math.toDegrees(1);
        System.out.println(i);

	}

}
