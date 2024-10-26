package com.Super;
class A1{
	{
		System.out.println("non static block A");
	}
	static {
		System.out.println("static block A");
	}
}
class B1 extends A1{
	{
		System.out.println("non static block B");
	}
	static {
		new A1();
		System.out.println("static block B");
	}
}
public class Demo {

	public static void main(String[] args) {
		new B1();
		

	}

}
