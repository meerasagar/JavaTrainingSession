package methodOverriding;

public class Example10 extends Example9 {

	//cannot override final method from Example9
/*	public void test1()
	{
		System.out.println("child class test1");
	}
	//cannot override the static method from Example9
	public void test2()
	{
		System.out.println("child class test2");
	}*/
	
	public void test3()
	{
		System.out.println("child class test3");
	}
	
	
	
	public static void main(String[] args) {
		
		Example9 obj = new Example10();
		obj.test3();
		
	}
}
