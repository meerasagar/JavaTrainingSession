package inheritance;

public class ChildClass2 extends ParentClass2 {

	public void test3()
	{
		System.out.println("child c.03214lass test3()");
	}
	
	public static void main(String[] args) {
		
		//ParentClass2 obj = new ChildClass2();
		
		ChildClass2 obj = new ChildClass2();
		
		obj.test1();
		obj.test2();
		obj.test3();
		
	}
	
	
	
}
