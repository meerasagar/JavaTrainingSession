package thisExamples;

public class Example7 {

	int i=90;
	
	Example7()
	{  //this can be passed as an argument in the constructor call.
		Example6 obj = new Example6(this);
		obj.display();
		
	}
	
	public static void main(String[] args) {
		
		Example7 obj = new Example7();
		
	}
}
