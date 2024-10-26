package com.Super;
class A2{
	A2(){
		System.out.println("A cons");
		
	}
}
class B2 extends A2{
	B2(){
		System.out.println("B cons");
	}
}
class C2 extends B2{
	C2(){
		System.out.println("C cons");
	}
}
public class Example1 {

	public static void main(String[] args) {
		new C2();
		

	}

}
