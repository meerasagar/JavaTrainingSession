package exceptionHandling;

public class ArithMeticException {
	
	public static void main(String args[])
	{
		try{
		int i = 5/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("Handled ArithMetic Exception");
	}

}
