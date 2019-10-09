package thisExamples;

public class Example3 {

	
	Example3()
	{
		this(10,20);
		System.out.println("default constructor");
	}
	
	Example3(int i)
	{ //constructor call must be the first statement in a constructor
		
		//this();
		System.out.println("parameterized constructor (int i)");
		
	}
	
	Example3(int i, int j)
	{
		this(10);
		System.out.println("parameterized constructor (int i, int j)");
	}
	
	public static void main(String[] args) {
		
		Example3 obj = new Example3();
		
	}
}
