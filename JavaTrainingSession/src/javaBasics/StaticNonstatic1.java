package javaBasics;

public class StaticNonstatic1 {
	
	public static String college = "VIGNAN";
	public int age;
	public int rollnumber;//Global Variables
	
	StaticNonstatic1(int rollnum, int ageob)
	{
		age = ageob;
		rollnumber = rollnum;
		
	}
	
	public void display()
	{
		System.out.println("Value of rollnumber is:"+ rollnumber+"Value of age is:"+age + "value of college is:"+college);
	}
	
	public static void main(String[] args) {
		
		StaticNonstatic1 obj1 = new StaticNonstatic1(120,25);
		obj1.display();
		StaticNonstatic1 obj2 = new StaticNonstatic1(130,22);
		obj2.display();
		StaticNonstatic1 obj3 = new StaticNonstatic1(127,26);
		obj3.display();
		
	}
	

}
