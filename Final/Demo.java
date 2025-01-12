package com.Final;
class A{
	void m1() {
		System.out.println("M1 A");
	}
}
class B extends A{
	@Override
	final void m1() {
		System.out.println("M1 B");
	}
}
class C extends B{
	
}
public class Demo {

	public static void main(String[] args) {
		C c=new C();
		c.m1();
		
		

	}

}
