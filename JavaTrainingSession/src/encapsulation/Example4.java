package encapsulation;

public class Example4 {
	
public static void main(String[] args) {
		
		Example3 obj = new Example3();
		
		//obj.setAge(34);
		//obj.setEmpID(26);
		//obj.setName("sagar");
		
		System.out.println("Name is: " + obj.getName() + " Age is: " + obj.getAge() + " EmpID:" + obj.getEmpID());
	}

}
