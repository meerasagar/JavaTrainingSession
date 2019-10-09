package thisExamples;

public class Example5 {

	int a;
	int b;
	
	Example5()
	{
		a= 10;
		b = 20;
	}
	
	public void display(Example5 obj)
	{
		System.out.println("Value of a is:" +a + "value of b is:" + b);
	}
	
	public void get()
	{
		display(this);
	}
	
	public static void main(String[] args) {
		
		Example5 obj = new Example5();
		obj.get();
		
	}
	
	
}
