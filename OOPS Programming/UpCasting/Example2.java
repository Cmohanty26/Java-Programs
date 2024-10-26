package com.UpCasting;
class E{
	void m1() {
		System.out.println("M1-A");
	}
}
class F extends E{
	void m2() {
		System.out.println("M2 B");
	}
}
class G extends F{
	void m3() {
		System.out.println("M3-C");
	}
}
public class Example2 {

	public static void main(String[] args) {
		E e=new E();
		e.m1();
		F f=new F();
		f.m1();
		f.m2();
		
		

	}

}
