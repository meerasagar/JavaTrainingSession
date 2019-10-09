package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableConcept {
	
	public static void main(String[] args) {
		//it is similar to Hashmap, but it is synchronized.
		//stores the value on the basis of key-val.
		//We cannot store null key or null value
		
		Hashtable h1 = new Hashtable();
		
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		h1.put(null, "Test1");
		
		
		//Create a clone copy;
		
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable)h1.clone();
		System.out.println("The values from h1 "+ h1);
		System.out.println("The values from h2 "+ h2);
		
		h1.clear();
		System.out.println("The values from h1 "+ h1);
		System.out.println("The values from h2 "+ h2);
		
		//Contains value
		Hashtable st = new Hashtable();
		st.put("A", "SAGAR");
		st.put("B", "MANAGER");
		st.put("C", "SELENIUM");
		if(st.containsValue("SAGAR"))
			System.out.println("value is found");
		
		//Print all the values from hashtable using -- Enumeration -- elements()
		Enumeration e = st.elements();
		System.out.println("Print values from st");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//get all the values from hashtable using -- entrySet() -- set of Hashtable values
		
		System.out.println("Print values from st using entry set");
		
		Set s = st.entrySet();
		System.out.println(s);
		
		Hashtable st1 = new Hashtable();
		st1.put("A", "SAGAR");
		st1.put("B", "MANAGER");
		st1.put("C", "SELENIUM");
		
		//check both the hashtables are equal or not
		if(st.equals(st1))
			System.out.println("both are equal");
		
		//get the value from a key
		System.out.println(st1.get("A"));
		
		//get the hashcode of hashtable object
		
		System.out.println("The hashcode value of st1 : " + st1.hashCode());
		
		//generics
		
		Hashtable<String, String> st3 = new Hashtable<String, String>();

	}

}
