package com.inheritance;
class A3{
	{
		System.out.println("Non static Block A");
	}
	static {
		System.out.println("Static Block A");
	}
	A3(){
		System.out.println("A cons");
	}
}
class B3 extends A3{
	{
		System.out.println("Non static Block B");
	}
	static {
		new A3();
		System.out.println("Static Block B");
	}
	B3(){
		System.out.println("B cons");
	}
}
public class Demo {
	{
		System.out.println("static block demo");
	}

	public static void main(String[] args) {
		System.out.println("main start");
		new B3();
		System.out.println("main ends");
		
		

	}

}
