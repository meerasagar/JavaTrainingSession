package thisExamples;

public class Person {

	
	String name;
	int age;
	int salary;
	public Person(String name, int age, int salary) {
		//super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println("name is:"+name + "age is:" + age + "salary is:" + salary );
	}
	
	public static void main(String[] args) {
		
		Person obj = new Person("test1", 23, 2000);
		obj.display();
		
		Person obj1 = new Person("test2", 22, 3000);
		obj1.display();
	}
}
