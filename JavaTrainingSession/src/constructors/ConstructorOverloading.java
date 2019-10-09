package constructors;

public class ConstructorOverloading {
	
	ConstructorOverloading()
	{
		System.out.println("Default constructor");
	}
	
	ConstructorOverloading(int a, int b)
	{
		System.out.println("parameterized constructor (int a, int b)");
	}
	
	ConstructorOverloading(double a, double b)
	{
		System.out.println("parameterized constructor (double a, double b)");
	}
	
	ConstructorOverloading(int a, int b, int c)
	{
		System.out.println("parameterized constructor (int a, int b, int c)");
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading obj1 = new ConstructorOverloading();
		
		ConstructorOverloading obj2 = new ConstructorOverloading(10,20);
		
		ConstructorOverloading obj3 = new ConstructorOverloading(10.25,15.26);
		
		ConstructorOverloading obj4 = new ConstructorOverloading(100,200,300);
	}

}
