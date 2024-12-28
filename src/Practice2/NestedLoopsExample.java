package Practice2;

public class NestedLoopsExample {

	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {          //1-6-19
			for(int j = 1; j <= i; j++) {      //2-7-13-20-28-36
				for(int k = 1; k <= i; k++)	{  //3-8-10-14-16-21-23-25-29-31-33-37-39-41
					System.out.print(i);       //4-9-11-15-17-22-24-26-30-32-34-38-40-42
				}
				System.out.println();          //5-12-18-27-35-43
			}
			//System.out.println();
		}
		//System.out.println();
		System.out.println("That's all folks...");
		for(int i = 1; i <= 3; i++) {          
			for(int j = 1; j <= i; j++) {      
				for(int k = 1; k <= i; k++)	{
					for (int l = 1; l <= k; l++) {
					System.out.print(i);       
					}
				}
				System.out.println();
			}
		}
		/*for(int line = 1; line <= 6; line++) {
			for(int space = 1; space <= )
		}*/
	}

}
