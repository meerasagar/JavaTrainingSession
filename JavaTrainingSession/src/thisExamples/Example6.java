package thisExamples;

public class Example6 {
 
	int i;
	
	Example6(Example7 obj)
	{
		i= obj.i;
	}
	
	public void display()
	{
		System.out.println("value of i is:" + i);
	}
}
