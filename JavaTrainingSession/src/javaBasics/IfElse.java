package javaBasics;

public class IfElse {

	public static void main(String[] args) {
		
		boolean bl = false;
		if(bl)
		{
			System.out.println("we are in if");
		}
		else
		{
			System.out.println("we are not in if");
		}
		
		int a =60;
		int b=30;
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("b is greater");
		}
		
		int i =20;
		int j =20;
		if(i==j)
		{
			System.out.println("i and j are equal");
		}
		else
		{
			System.out.println("i and j are not equal");
		}
		//write a program to find a greater number.
		int a1=80;
		int b1=70;
		int c1=90;
		if(a1>b1 & a1>c1)//both the condition has to satisfy
			//true and true = true
			//true and false = false
		{
			System.out.println("a1 is greater");
		}
		else if(b1>c1)
		{
			System.out.println("b1 is greater");
		}
		else
		{
			System.out.println("c1 is greater");
		}
		
		
	}
	
}
