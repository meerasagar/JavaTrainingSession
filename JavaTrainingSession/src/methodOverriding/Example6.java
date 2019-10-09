package methodOverriding;

public class Example6 extends Example5 {

	public void test1(int a)
	{
		System.out.println("child class example6");
	}
	
	public static void main(String[] args) {
		
		Example5 obj = new Example6();
		obj.test1(10);
	}
}
