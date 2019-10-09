package thisExamples;

public class Example8 {
	//this can also be used to return current class instance.
	int i =90;
	
	public Example8 test1()
	{
		return this;
	}
	
	public Example8 test2()
	{
		return new Example8();
	}
	
	public static void main(String[] args) {
		
		Example8 obj = new Example8();
		System.out.println(obj.i);
	}

}
