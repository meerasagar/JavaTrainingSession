package exceptionHandling;

public class MultipleTry {

	public static void main(String[] args) {

		try {

			try {
				String s = null;
				System.out.println(s.length());
				int i = 5 / 0;
			}

			catch (ArithmeticException e) {
				System.out.println(e);
				System.out.println("Arithmetic Exception getting called");
			}

			catch (Exception e) {
				e.printStackTrace();
				System.out.println("NullPointer Exception getting called");
			}

			try {

				int arr[] = new int[4];
				System.out.println(arr[5]);
			}

			catch (java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("ArrayIndex Out Of Bounds Exception getting called");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Outer Catch block");
		}

		System.out.println("Normal flow...");
	}

}
