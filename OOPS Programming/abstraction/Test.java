package com.abstraction;
abstract class A{
	A(){
		System.out.println("No arg cons");
	}
	abstract void m1();
	void m2() {
		
	}
}
class B extends A{

	@Override
	void m1() {
		System.out.println("Good Morning");
		
	}
	@Override
	void m2() {
		System.out.println("How are you");
	}
	
}
public class Test {

	public static void main(String[] args) {
		A a;
		a=new B();
		a.m1();
		a.m2();
		

	}

}
