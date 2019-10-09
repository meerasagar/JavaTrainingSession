package methodOverriding;

public class Example2 extends Example1 {

	public static void main(String[] args) {
		
		Example1 obj = new Example2();
		
		obj.test1();
	}
	
	public void test1()
	{
		System.out.println("Example2 child class");
	}
}
