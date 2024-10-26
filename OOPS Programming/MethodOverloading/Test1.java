package com.MethodOverloading;
class A1{
	void m1() {
		System.out.println("M1-A");
	}
	void m2() {
		System.out.println("M2-A");
	}
}
class B1 extends A1{
	@Override
	void m1() {
		System.out.println("M1-B");
	}
}
class C1 extends B1{
	@Override
	void m2() {
		System.out.println("m2-C");
	}
}
public class Test1 {

	public static void main(String[] args) {
		C1 c=new C1();
		c.m1();
		c.m2();
		B b=new B();
		b.m1();
		
		}

}
