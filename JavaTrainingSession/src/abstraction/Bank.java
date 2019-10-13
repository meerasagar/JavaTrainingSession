package abstraction;

public abstract class Bank {
	
	
	public abstract void loan();
	
	public void credit()
	{
		System.out.println("credit card");
	}
	
	public void debit()
	{
		System.out.println("debit card");
		
		System.out.println("debit card1");
		
		
	}
	
	Bank()
	{
		
	}
	
	Bank(String name)
	{
		
	}
	


}
