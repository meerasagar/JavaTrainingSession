package oopsInJava;

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		//obj.calculateArea(10);
		//obj.calculateArea(10, 20);
		obj.calculateArea(10, 20, 30);
	}
	
	public void calculateArea(int l)
	{
		System.out.println("Calculating area of square: " + l*l);
	}
	
	public void calculateArea(int l, int h)
	{
		System.out.println("Calculating area of rectangle: " + l*h);
	}
	
	public void calculateArea(int l, int h, int b)
	{
		System.out.println("Calculating area of triangle: " + l*b*h);
	}

}
