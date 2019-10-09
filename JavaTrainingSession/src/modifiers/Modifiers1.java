package modifiers;

public class Modifiers1 {
	
	public static void main(String[] args) {
		
		Modifiers obj = new Modifiers();
		
		obj.test1();
		obj.test2();
		obj.test4();
		
		System.out.println("******************");
		
		System.out.println("public variable: "+ obj.i);
		System.out.println("protected variable: "+ obj.str);
		System.out.println("default variable: "+ obj.k);
		
		
	}

}
