package encapsulation;

public class Example3 {

	private int age=30;
	private int EmpID=100;
	private String name="John";

	/*public void setAge(int age) {

		this.age = age;

	}
*/
	public int getAge() {
		return age;
	}

	/*public void setEmpID(int EmpID) {
		this.EmpID = EmpID;
	}*/

	public int getEmpID() {
		return EmpID;
	}

	/*public void setName(String name) {

		this.name = name;

	}*/

	public String getName() {
		return name;
	}
}
