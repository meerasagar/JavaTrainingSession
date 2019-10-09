package methodOverriding;

public class Example4 extends Example3 {

	public static void main(String[] args) {
		
		Example3 obj = new Example4();
		obj.test4();
		//We cannot override private members
	}
}
