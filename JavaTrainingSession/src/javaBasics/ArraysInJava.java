package javaBasics;

public class ArraysInJava {

	public static void main(String[] args) {
	
		int arr[] = new int[5];
		arr[0] = 20;
		arr[1] = 40;
		arr[2] = 30;
		arr[3] = 50;
		arr[4] = 25;
		
		System.out.println("Array Length: "+arr.length);
		
		//System.out.println(arr[2]);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("**************************");
		//For each
		/*for(int obj : arr)
		{
			System.out.println(obj);
		}*/
		
		int arr1[] = {20,10,30,40,60};
		System.out.println("Array Length: "+arr1.length);
		for(int j=0; j<arr1.length;j++)
		{
			System.out.println(arr1[j]);
		}
		System.out.println("********************");
		
		double db[] = new double[5];
		db[0] = 2.35;
		db[1] = 20.12;
		System.out.println("double array:"+db[1]);
		
		System.out.println("***********************");
		
		char c[] = new char[3];
		c[0] = 'c';
		c[1] = 'd';
		System.out.println("char array:"+c[1]);
		
		System.out.println("************************");
		
		boolean bl[] = new boolean[2];
		bl[0] = true;
		bl[1] = false;
		System.out.println(bl[0]);
		
		System.out.println("***********************");
		
		String str[] = new String[4];
		str[0] = "Hi";
		str[1] = "Hello";
		str[2] = "How are you";
		System.out.println("String array:"+str[2]);
		
		System.out.println("************************");
		
		Object obj[] = new Object[5];
		obj[0] = 30;
		obj[1] = 'c';
		obj[2] = "sagar";
		obj[3] = 20.35;
		obj[4] = true;
		
		for (int k=0; k<obj.length;k++)
		{
			System.out.println(obj[k]);
		}
		
		 
	}
	 
}
