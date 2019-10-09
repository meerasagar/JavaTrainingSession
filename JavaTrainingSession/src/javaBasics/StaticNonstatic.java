package javaBasics;

public class StaticNonstatic {

	public int i=0;
	
	public static int counter=0;
	
	StaticNonstatic()
	{
		counter++;
		i++;
		//System.out.println("Value of i is: " + i + "Value of counter is:"+counter);
		
	}
	
	public void display()
	{
		System.out.println("Value of i is: " + i + "Value of counter is:"+counter);
	}
	
	public static void main(String[] args) {
		
		StaticNonstatic obj1 = new StaticNonstatic();
		
		StaticNonstatic obj2 = new StaticNonstatic();
		
		StaticNonstatic obj3 = new StaticNonstatic();
		obj1.display();
		obj2.display();
		obj3.display();
		
	}
		
	

}
