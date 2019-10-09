package interfaceInJava;

public interface Example6 {
	
	public void test();
	
	public default void sum()
	{
		int a =10;
		int b =20;
		int c = a+b;
		System.out.println("Sum of a and b: " + c);
	}
	
	public static void sub()
	{
		int i =30;
		int j =10;
		int k = i-j;
		
		System.out.println("Sub of a and b: " + k);
	}
	
	//We cannot create an object in interface
	
	/*public static void main(String[] args) {
		
		Example6 obj = new Example6();
		
	}*/
	
	

}
