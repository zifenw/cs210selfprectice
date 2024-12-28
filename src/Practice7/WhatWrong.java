package Practice7;

class shape{
	private int width;
	private int height;
	
	shape(int w, int h) {  
		this.width = w;
		this.height = h;
	}   // constructor
	
	public int getArea() {
		return width*height;
	}
}

public class WhatWrong {

	public static void main(String[] args) {
		shape s1 = new shape(1,2);
		shape s2 = new shape(3,4);
		
		System.out.println(s1.getArea());
		System.out.println(s2.getArea());

	}

}
