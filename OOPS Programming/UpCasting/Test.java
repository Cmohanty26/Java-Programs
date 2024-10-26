package com.UpCasting;
class A1{
	
}
class B1 extends A1{
	
}
class C extends A1{
	
}
class D {
	
}
public class Test {
	public static void m1(A1 a) {
		System.out.println("M1 Called");
	}

	public static void main(String[] args) {
		
	
		m1(new A1());
		m1(new B1());
		m1(new C());
		//m1(new D());
		
		

	}

}
