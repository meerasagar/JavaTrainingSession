package constructors;

public class Constructors {
	int a;
	int b;
	Constructors()
	{
		System.out.println("Default Constructor");
	}
	
	Constructors(int a, int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("Parameterized constructor");
	}

	public static void main(String[] args) {
	
		Constructors obj1 = new Constructors();
		
		Constructors obj2 = new Constructors(10,20);
		
	}

}
