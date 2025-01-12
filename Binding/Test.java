package com.Binding;
class A1 {
	int i=10;
	static int j=20;
	
}
class B1 extends A1{
	int i=30;
	static int j=40;
	
	
}
public class Test {

	public static void main(String[] args) {
		A1 a=new B1();
		System.out.println(a.i);
		System.out.println(a.j);

	}

}
