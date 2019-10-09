package exceptionHandling;

public class FinallyInJava3 {
	
	public static void main(String[] args) {
		
		try{
		int i = 2/3;
		return;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Finally block always executes");
		}
		
	}

}
