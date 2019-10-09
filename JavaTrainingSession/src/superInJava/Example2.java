package superInJava;

public class Example2 extends Example1
{	
	public String color = "black";
	
	public void display()
	{
		System.out.println("child class color is:"+color);
		System.out.println("parent class color is:"+super.color);
	}
	
	


public static void main(String[] args) {
	
	Example2 obj = new Example2();
	obj.display();
}

}
