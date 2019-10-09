package thisExamples;

public class Example1 {
	
	int a; 
	int b;
	//this() can be used to refer current class instance variable
	public Example1(int a, int b)
	{
	this.a=a;
	this.b=b;
	}
	
	public void display()
	{
		System.out.println("Value of a is: "+ a + "Value of b is:" + b);
	}
	
	public static void main(String[] args) {
	
		Example1 obj = new Example1(10,20);
		obj.display();
		
	}
	
	

}
