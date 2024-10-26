package com.Super;
class A3{
	A3(){
		System.out.println("A cons");
	}
}
class B3 extends A3{
	B3(){
		System.out.println("B cons");
	}
	B3(int i){
		System.out.println("B int cons");
	}
}
class C3 extends B3{
	C3(){
		System.out.println("C cons");
	}
	C3(int i){
		System.out.println("C int cons");
	}
}
public class Example2 {

	public static void main(String[] args) {
		new C3();
		new C3(10);
		
		

	}

}
