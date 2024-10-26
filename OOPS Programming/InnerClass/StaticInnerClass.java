package com.InnerClass;

public class StaticInnerClass {
	static class B{
		public static void m1() {
			System.out.println("Static Inner M1 method");
		}
		public void m2() {
			System.out.println("Non-static inner m2");
		}
	}

	public static void main(String[] args) {
		System.out.println("Outer Main Method");
		StaticInnerClass.B.m1();
		StaticInnerClass.B a=new StaticInnerClass.B();
		a.m2();
		

	}

}
