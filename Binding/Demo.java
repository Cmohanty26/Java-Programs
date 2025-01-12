package com.Binding;
class A{
	static void m1() {
		System.out.println("static M1 A");
		
	}
	void m2() {
		System.out.println("Non static m2 A");
		
	}
}
class B extends A{
	static void m1() {
		System.out.println("staic M1 B");
		
	}
	@Override
	void m2() {
		System.out.println("Non static m2-B");
	}
}
public class Demo {

	public static void main(String[] args) {
		A a=new B();
		a.m2();
		a.m1();
		

	}

}
