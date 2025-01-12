package com.InnerClass;

public class A {
	 class B1{
		public  void m1() {
			System.out.println("Static inner M1 method");
		}
		public void m2() {
			System.out.println("Non Static inner m2");
		}
	}

	public static void main(String[] args) {
		System.out.println("Outer Main method");
		//A.B1.m1();
		A a=new A();
		A.B1 b=a.new B1();
		b.m2();
		A.B1 b1=new A().new B1();
		b1.m2();
		new A().new B1().m2();

	}

}
