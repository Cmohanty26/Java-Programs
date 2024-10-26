package com.UpCasting;
class A2 extends Object{
	public static A2 m1() {
		return new A2();
	}
}
class B2 extends Object{
	}
class C2 extends B2{
	public static B2 m1() {
		return new B2();
		
	}
}
class D2{
	public static Object m1() {
		return new A2();
		
		
	}
}
public class Example1 {
	public static void m1(Object o) {
		System.out.println("m1 is called");
	}

	public static void main(String[] args) {
		m1(new B2());
		m1(new C2());
		m1(new D2());
		m1(new A2());
		

	}

}
