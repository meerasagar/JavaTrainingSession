package methodOverriding;

public class Example8 extends Example7 {

	/*protected void test1()
	{
		System.out.println("child class test1()");
		
	}*/
	
	
	public void test1()
	{
		System.out.println("child class test1()");
		
	}
	
	public static void main(String[] args) {
		
		Example7 obj = new Example8();
		obj.test1();
	}
}
