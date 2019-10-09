package javaBasics;

public class Loopsinjava {

	public static void main(String[] args) {
	
		
		int i =1; //Initialization
		
		while(i<=10) //condition
		{
			
			System.out.println(i);
			//i++; //incrementation
			i=i+1;
			
			System.out.println("**************************");
			
			for(int j=1; j<=10; j++)
			{
				System.out.println(j);
			}
			System.out.println("**********************");
			//print values from 10 to 1
			
			for(int k=10; k>=1;k--)
			{
				System.out.println(k);
			}
			
		}
	}
}
