package inheritance;

public class C extends B {

	public void test4()
	{
		System.out.println("Class C test4()");
	}
	
	public static void main(String[] args) {
		
		C obj = new C();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		
		
	}
}
