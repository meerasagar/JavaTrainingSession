package testModifiers;

import modifiers.Modifiers;

public class Modifiers3 extends Modifiers {

	public static void main(String[] args) {
		
		Modifiers3 obj = new Modifiers3();
		
		obj.test1();
		obj.test2();
		
		System.out.println("************");
		
		System.out.println("public variable: "+ obj.i);
		System.out.println("protected variable: "+ obj.str);
		
		
	}
}
