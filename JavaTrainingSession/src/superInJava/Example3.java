package superInJava;

public class Example3 {
	
	int salary;
	int age;
	
	/*Example3()
	{
		
	}*/
	
	Example3()
	{
		System.out.println("I am parent constructor");
	}
	
	Example3(int salary, int age)
	{
		
		this.salary = salary;
		this.age = age;
	}
	
	public int getSalary()
	{
		return salary;
		
		
	}
	
	public int getAge()
	{
		return age;
	}
	

}
