package exceptionHandling;

public class ThrowInJava {
	
	public static void validateAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Person is not eligible for voting");
		}
		else
		{
			System.out.println("Person is eligible for voting");
		}
	}
	
	public static void main(String[] args) {
		
		validateAge(20);
	}

}
