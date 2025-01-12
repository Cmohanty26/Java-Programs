package com.inheritance;
class A1{
	int i=10;
	
}
class B1 extends A1{
	int i=20;
	void m2() {
		System.out.println(i);
		System.out.println(super.i);
	}
}
public class Example3 {

	public static void main(String[] args) {
		B1 b=new B1();
		b.i=30;
		b.m2();
		

	}

}
