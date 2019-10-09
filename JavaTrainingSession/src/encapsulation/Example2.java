package encapsulation;

public class Example2 {
	
	public static void main(String[] args) {
		
		Example1 obj = new Example1();
		
		obj.setAge(34);
		obj.setEmpID(26);
		obj.setName("sagar");
		
		System.out.println("Name is: " + obj.getName() + " Age is: " + obj.getAge() + " EmpID:" + obj.getEmpID());
	}

}
