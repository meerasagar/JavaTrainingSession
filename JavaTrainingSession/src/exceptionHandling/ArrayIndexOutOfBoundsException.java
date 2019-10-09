package exceptionHandling;

public class ArrayIndexOutOfBoundsException {
	
	public static void main(String[] args) {
		
		int arr[] = new int[4];
		try {
			System.out.println(arr[5]);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Handled Array Index Out of bounds exception");
		}
	}

}
