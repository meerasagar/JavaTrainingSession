package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();

		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(50);
		arr1.add(40);
		arr1.add(50);
		
		for(int i =0 ; i<arr1.size();i++)
		{
			System.out.println(arr1.get(i));
		}
	System.out.println("********************************");
	
		ArrayList<String> arr2 = new ArrayList<String>();
		
		arr2.add("QTP");
		arr2.add("Selenium");
		arr2.add("Test Complete");
		
		Iterator<String> itr = arr2.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("**********************************");
		
		ArrayList<String> arr3 = new ArrayList<>();
		
		arr3.add("Java");
		arr3.add("C#");
		arr3.add("Selenium");
		
		//arr2.addAll(arr3);
		
		for(int i =0; i<arr2.size();i++)
		{
			System.out.println(arr2.get(i));
		}
		
		System.out.println("****************************************");
		//arr2.removeAll(arr3);
		for(int i =0; i<arr2.size();i++)
		{
			System.out.println(arr2.get(i));
		}
		
		System.out.println("********************************************");
		arr2.retainAll(arr3);
		
		for(int i =0; i<arr2.size();i++)
		{
			System.out.println(arr2.get(i));
		}		
		
		
		
		
	}
	

}
