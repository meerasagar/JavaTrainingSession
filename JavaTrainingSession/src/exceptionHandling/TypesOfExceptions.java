package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TypesOfExceptions {

	public static void arithMeticException()
	{
		int i = 5/0;
		
		System.out.println("Arithmetic Exception is not handled");
	}
	
	public static void arrayIndexOutOfBoundsException()
	{
		
		int arr[] = new int[4];
		System.out.println(arr[5]);
	}
	
	public static void nullPointerException()
	{
		String str = null;
		
		System.out.println(str.length());
	}
	
	public static void stackOverFlow()
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(true)
		{
			System.out.println(arr.add(10));
		}
	}
	
	public static void outOfMemoryException()
	{
		long l[] = new long[1000000000];
		System.out.println(l);
	}
	
	public static void fileNotFoundException() throws FileNotFoundException
	{
		FileReader fr = new FileReader("C:\\test.xlsx");
	}
	
	public static void numberFormatException()
	{
		String s = "Hi";
		int i = Integer.parseInt(s);
		System.out.println(i);
	}
	
	public static void timeOutException() throws InterruptedException
	{
		Thread.sleep(3000);
		
	}
	
	public static void illegalStateException()
	{
		String s = "Hello";
		Scanner sc = new Scanner(s);
		System.out.println(sc.nextLine());
		sc.close();
		System.out.println(sc.nextLine());
		
	}
	
	public static void classNotFoundException() throws ClassNotFoundException
	{
		Class.forName("test");
	}
	
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		arithMeticException();
	}
	
	
}
