package com.UpCasting;
class A{
	
}
class B extends A{
	
}
public class Demo {

	public static void main(String[] args) {
		//A a=new B();
		B b=new B();
		//A a=b;
		A a=(A)b;
		
		
		
	}

}
