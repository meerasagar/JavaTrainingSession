package interfaceInJava;

public class Example7 implements Example6 {

	@Override
	public void test() {
		
		System.out.println("Interface Example6 test");
		
	}
	
	public static void main(String[] args) {
		
		Example6 obj = new Example7();
		
		obj.sum();
		Example6.sub();
		obj.test();
	}
	
	

}
