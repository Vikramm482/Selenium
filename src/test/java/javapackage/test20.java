package javapackage;

public abstract class test20 
{

	 abstract void m1(); // 3 abstract method
	 abstract void m2();
	 abstract void m3();
	 void m4()          // 1 normal method
	 {
		 System.out.println("m4 method");

	 }
	  public class test10 extends test20 {
		 void m1()
		 {
			 System.out.println("m1 method");
		 }
	 void m2()
		 {
			 System.out.println("m2 method");
		 }
	 void m3()
		 {
			 System.out.println("m3 method");
		 }
	 

	public static void main(String[] args)
	{
		
		test10 obj= new test10();
				obj.m1();
				obj.m2();
				obj.m3();
				obj.m4();
	}
}
}

	 
	
	 
	

		


