package com.Binding;
class A2{
	static int a=10;
	int b=20;
	static void m1() {
		System.out.println("static M1-A");
	}
	void m2() {
		System.out.println("Non static M2-A");
	}
	final void m3() {
		System.out.println("final M3-A");
	}
}
class B2 extends A2{
	static int a=30;
	int b=40;
	static void m1() {
		System.out.println("static m1-B");
	}
	@Override
	void m2() {
		System.out.println("non static m2-B");
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		A2 a=new B2();
		System.out.println(a.a);
		System.out.println(a.b);
		a.m1();
		a.m2();
		a.m3();
		

	}

}
