package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx4 {
	
	public static void main(String[] args) {
		
		Employee obj1 = new Employee("Rajesh",20, "POLICE");
		Employee obj2 = new Employee("Test1",30, "IT");
		Employee obj3 = new Employee("Test2",40, "NON IT");
		
				
				
		ArrayList<Employee> arr = new ArrayList<Employee>();
		arr.add(obj1);
		arr.add(obj2);
		arr.add(obj3);
		
		/*for(int i=0; i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}*/
		
		Iterator<Employee> itr = arr.iterator();
		
		while(itr.hasNext())
		{
			Employee arr1 = itr.next();
			System.out.println(arr1.name);
			System.out.println(arr1.age);
		}
		
		//Default capacity of a Arraylist is 10.
		//New Capacity = (current capacity*3/2)+1
	}

}
