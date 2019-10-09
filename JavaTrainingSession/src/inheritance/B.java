package inheritance;

public class B extends A {

	public void test3()
	{
		System.out.println("Class B test3()");
	}
	
	public static void main(String[] args) {
		
		B obj = new B();
		
		obj.test1();
		obj.test2();
		obj.test3();
		
	}
}
