package inheritance;

public class ChildClass1 extends ParentClass1 {

	public static void main(String[] args) {
		
		ChildClass1 obj = new ChildClass1();
		
		
	}
	
	ChildClass1()
	{
		
		System.out.println("child class constructor");
	}
	
	//Cannot inherit parentclass constructor
	
	/*public ParentClass1()
	{
		System.out.println("parentclass1");
	}
	
	public ParentClass1(int a)
	{
		System.out.println("parentclass parameterized");
	}*/
	
}
