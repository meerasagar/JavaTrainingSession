package exceptionHandling;

public class MultipleCatch {
	
	public static void main(String[] args) {
		
		
		int arr[] = new int[4];
		try {
			
			int i = 5/1;
			System.out.println(arr[5]);
			
		} 
		
		catch(ArithmeticException e)
		{
			
			e.printStackTrace();
			System.out.println("Handled Arithmetic Exception");
		}
		
		
		
		catch (java.lang.ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			System.out.println("Handled Array Index Out of bounds exception");
		}
		

		
		
	}

}
