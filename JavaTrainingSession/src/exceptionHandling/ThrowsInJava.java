package exceptionHandling;

import java.io.FileNotFoundException;

public class ThrowsInJava {
	
	public static void validateAge(int age) throws FileNotFoundException
	{
		if(age<18)
		{
			throw new FileNotFoundException("Person is not eligible for voting");
			
		}
		else
		{
			System.out.println("eligible for voting");
		}
				
	}
	
	public static void callValidateAge() throws FileNotFoundException
	{
		try {
			validateAge(15);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("throws in java");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		callValidateAge();
	}

}
