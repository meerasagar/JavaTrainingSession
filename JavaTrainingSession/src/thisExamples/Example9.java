package thisExamples;

public class Example9 {

	//this is available only for non-static
	
	int i = 90;
	
	public void test1()
	{
		this.test3();
		System.out.println("test1()");
	}
	
	public static void test2()
	{
		//this.test2();
	}
	public void test3()
	{
		System.out.println("test3");
	}
	
	public static void main(String[] args) {
		
		Example9 obj = new Example9();
		obj.test1();
	}
}
