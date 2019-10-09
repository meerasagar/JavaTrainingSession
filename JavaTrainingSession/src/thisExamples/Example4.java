package thisExamples;

public class Example4 {
	
	//this can be used to invoke current class method.

	public void display()
	{
		this.show();
		System.out.println("I am in display method");
	}
	
	public void show()
	{
		System.out.println("I am in show method");
	}
	
	public static void main(String[] args) {
		
		Example4 obj = new Example4();
		obj.display();
		
		
		
	}
}
