package javapackage;

 class A //1 method
{
void m1()
 {
	System.out.println("m1 method");
 }
	class B extends A //2 Method
	{                  
	void m2()	
 {
	System.out.println("m2 method");	
 }
	}
	 class C extends A //2 Method
	{ void m3()
	 {
		System.out.println("m3 method");
	 }
	}
	
	public static void main(String[] args) 
	{
    	A obj1= new A();
    	obj1.m1();
    	
    	B obj2= new B();
    	obj2.m1();
    	obj2.m2();

    	C obj3=new C();
    	obj2.m1();
    	obj3.m3();
	}

}
