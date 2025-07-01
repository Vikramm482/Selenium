package javapackage;

public class Test8 {
	int a=10000;
	int b=20000;

	static void m1()
	{
		Test8 t8=new Test8();
		System.out.println(t8.a);
		System.out.println(t8.b);

		
		
	}
	static void m2() {
		Test8 t9=new Test8();
		System.out.println(t9.a);
		System.out.println(t9.b);
	}
	
	public static void main(String[] args) {
  Test8.m1();
  Test8.m2(); 
	}

}
