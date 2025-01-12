package com.inheritance;
class A2{
	static int i=10;
	static void m1() {
		System.out.println("M1 AA");
	}
}
class B2 extends A2{
	int j=20;
	void m2() {
		System.out.println(super.i);
		super.m1();
		
	}
	static void m3() {
		m1();
		A2.m1();
	}
}
public class Example4 {

	public static void main(String[] args) {
		B2 b=new B2();
		b.m3();
		b.m2();

	}

}
