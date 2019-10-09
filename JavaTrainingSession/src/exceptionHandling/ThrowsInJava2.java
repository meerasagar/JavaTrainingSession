package exceptionHandling;

import java.io.FileNotFoundException;

public class ThrowsInJava2 extends ThrowsInJava {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ThrowsInJava obj = new ThrowsInJava();
		
		try {
			obj.callValidateAge();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("ThrowsInJava2 code");
	}

}
