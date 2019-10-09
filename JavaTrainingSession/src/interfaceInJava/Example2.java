package interfaceInJava;

public class Example2 implements Example1, Example3 {

	public int i =10;
	
	public int j = 20;
	
	@Override
	public void test1() {
		
		System.out.println("test1");
		
	}

	@Override
	public void test2() {
		
		System.out.println("test2");
		
	}
	
	//@Override
	public void test3() {
		
		System.out.println("test3");
		
	}
	
	public static void main(String[] args) {
		
		Example2 obj = new Example2();
		
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(k);
		System.out.println(l);
		
	}

	//@Override
	public void test4() {
		
		System.out.println("test4");
		
	}

}
