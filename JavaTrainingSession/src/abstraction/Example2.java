package abstraction;

public class Example2 extends Example1 {

	@Override
	public void test2() {
		
		System.out.println("test2 under Example1");
	}

	@Override
	public void test3() {
		
		System.out.println("test3 under Example1");
	}
	
	public void test4()
	{
		System.out.println("test4 under");
		
		
	}

	public static void main(String[] args) {
		
		Example2 obj = new Example2();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
	}
	
	

}
