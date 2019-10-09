package superInJava;

public class Example4 extends Example3 {
	
	String name;
	
	
	Example4(String name, int salary, int age)
	{   
		//1st line of constructor;
		//super();
		super(salary,age);
		this.name = name;
		//this.age = age;
		//this.salary = salary;
	}
	
	Example4()
	{ 
		//super();
		System.out.println("I am child constructor");
	}
	
	public void display()
	{
		System.out.println("name is: "+name+ " salary is: " + salary + " age is: " + age);
	}
	
	public static void main(String[] args) {
		
		Example4 obj = new Example4("sagar", 2000,20);
		obj.display();
		System.out.println(obj.getAge());
		System.out.println(obj.getSalary());
		
		Example4 obj1 = new Example4();
		
	}
}
