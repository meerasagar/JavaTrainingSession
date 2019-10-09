package collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava3 {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("50");
		linkedList.add("50");
		linkedList.add("Test");
		linkedList.add("100");
		linkedList.add("true");
		linkedList.add("50");
		System.out.println(linkedList);
		
		//System.out.println(linkedList);
		
		System.out.println(linkedList.isEmpty());
		
		LinkedList<String> linkedList1 = new LinkedList<String>();
		linkedList1.add("50");
		linkedList1.add("50");
		linkedList1.add("Test");
		linkedList1.add("100");
		linkedList1.add("true");
		linkedList1.add("50");
		
		System.out.println(linkedList1);
		//List list = new ArrayList<>();
		//List<String> list1 = new ArrayList<String>();
		//ArrayList<Integer> list2 = new ArrayList<Integer>();
		//list2.add(10);
		
		//List list = new LinkedList<>();
				//List<String> list1 = new LinkedList<String>();
				//ArrayList<Integer> list2 = new LinkedList<Integer>();
				//list2.add(10);
	}
}
