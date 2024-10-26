package com.Super;

class A{
	/*A(int i){
		System.out.println("A cons");
	}*/
	A(){
		System.out.println("No arg");
	}
}
class B extends A{
	B(){
		//super(10);
		super();
		System.out.println("B cons");
		
	}
}
public class Test {

	public static void main(String[] args) {
		new B();
		

	}

}
