package interfaceInJava;

public class Example5 implements Example4 {

	@Override
	public void test1() {
		
		System.out.println("Interface Example1 test1");
		
	}

	@Override
	public void test2() {
		
		System.out.println("Interface Example1 test2");
		
	}

	//@Override
	public void test4() {
		
		System.out.println("Interface Example3 test4");
	}

	@Override
	public void test5() {
		
		System.out.println("Interface Example4 test5");
	}
	
	public static void main(String[] args) {
		
		Example5 obj = new Example5();
		obj.test1();
		obj.test2();
		obj.test4();
		obj.test5();
	}

	
}
