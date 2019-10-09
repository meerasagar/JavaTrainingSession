package exceptionHandling;

public class FinallyInJava2 {
	
	public static void arithMeticException()
	{
		int i;
		try {
			i = 5/0;
		}
		
		finally
		{
			System.out.println("finally always executes");
		}
	}
	
	public static void main(String[] args) {
		
		arithMeticException();
	}

}
