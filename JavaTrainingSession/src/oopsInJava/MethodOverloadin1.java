package oopsInJava;

public class MethodOverloadin1 {

public static void main(String[] args) {
		
	MethodOverloadin1 obj = new MethodOverloadin1();
	obj.test(10, 20);
	
		//obj.calculate*Area(10);
		//obj.calculateArea(10, 20);
		
	}
	
	public void test(int a, int b)
	{
		System.out.println("test(int a, int b)");
	}
	
	public void test(double a, double b)
	{
		
		System.out.println("test(double a, double b)");
	}
}
