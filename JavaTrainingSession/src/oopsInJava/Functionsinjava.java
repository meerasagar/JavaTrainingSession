package oopsInJava;

public class Functionsinjava {
	
	public static void main(String[] args) {
		
		Functionsinjava obj = new Functionsinjava();
		obj.test1();
		int m = obj.test2();
		System.out.println(m);
		
		int n = obj.test3(30, 40);
		System.out.println(n);
		
		int p = obj.test4(50, 10, 20);
		System.out.println(p);
		
		
	}

	public void test1()
	{
		int a =10;
		String str ="Hi";
		System.out.println(a);
	}
	public int test2()
	{
		int i =10;
		int j=20;
		int c = i+j;
		return c;
	}
	//input parameters or arguments
	public int test3(int x, int y)
	{ 
		
		int z = x+y;
		return z;
		
	}
	
	public int test4(int x1, int y1, int z1)
	{ 
		
		int z2 = x1+y1+z1;
		return z2;
		
	}
	
}
