package com.MethodOverloading;
class A2{
	void m1() {
		System.out.println("M1-A");
	}
	void m2() {
		System.out.println("M2-A");
	}
}
class B2 extends A2{
	@Override
	public void m1() {
		System.out.println("M1-B");
	}
	@Override
	protected void m2() {
		System.out.println("M2-B");
	}
}
public class Example1 {

	public static void main(String[] args) {
		B2 b=new B2();
		b.m1();
		b.m2();
		

	}

}
