package javaBasics;

public class Variablesinjava {
	
	int j =20;//Instance Variable or global variables
	String str = "Hi Hellow how are you";//Instance Variable
	static int k = 50;//static variable
	
	public void method1()
	{
	int i =10;	//Local Variable
	System.out.println("Non Static Method1 value: "+i);
	}
	
	public void method2()
	{
		double d = 12.77;//local variable
		System.out.println("Non static Method2 value: "+d);
	}
	
	public static void method3()
	{
		int c = 30;
		System.out.println("static Method3 value: "+c);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Printing static variable:"+k);
		
		Variablesinjava obj = new Variablesinjava();
		System.out.println("Printing non static variable1:"+obj.j);
		System.out.println("Printing non static variable2:"+obj.str);
		method3();
		obj.method1();
		obj.method2();
		
	}
	

}
