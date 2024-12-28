package Practice7;

class TriArea{
	public double width;
	   public double height;

	   public double area() {
	     double result = width * height / 2.0;
	     return result; 
	   }

}

public class classEx1 {

	public static void main(String[] args) {
		TriArea t = new TriArea();
		t.width = 5;
		t.height = 5;
		TriArea k = new TriArea();
		k.width = 10;
		k.height = 10;

	}

}
