package com.Super;
class A4{
	A4(){
		System.out.println("A cons");
	}
}
class B4 extends A4
{
	
	
	B4()
	{
		this(10);
		System.out.println("B cons");
		
	}
	B4(int i){
		System.out.println("B int cons");
	}
}
class C4 extends B4{
	C4(){
		System.out.println("C cons");
	}
	C4(int i){
		this();
		System.out.println("C int cons ");
	}
	
}
public class Example3 {

	public static void main(String[] args) {
		new C4(10);
		

	}

}
