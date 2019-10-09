package exceptionHandling;

public class FinallyInJava {

	public static void arithMeticException()
	{
		int i;
		try {
			i = 5/0;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	finally
	{
		System.out.println("finally block is always executes");
	}		
		
	}
	
	public static void main(String[] args) {
		
		arithMeticException();
	}
}
