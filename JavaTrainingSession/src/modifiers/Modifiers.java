package modifiers;

public class Modifiers {
	
	public int i =10;
	
	protected String str = "Hi";
	
	private int j = 100;
	
	int k =20;
	
	public static void main(String[] args) {
		
		Modifiers obj = new Modifiers();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		System.out.println("************************");
		System.out.println("public variable: "+ obj.i);
		System.out.println("protected variable: "+ obj.str);
		System.out.println("private variable: "+ obj.j);
		System.out.println("default variable: "+ obj.k);
		
	}
	
	public void test1()
	{
		System.out.println("Access Modifier public");
	}
	
	protected void test2()
	{
		System.out.println("Access Modifier protected");
	}
	
	private void test3()
	{
		System.out.println("Access Modifier private");
	}

	void test4()
	{
		System.out.println("Access Modifier default");
	}
	
}
