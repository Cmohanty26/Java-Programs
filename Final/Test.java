package com.Final;
class AA{
	void m1() {
		System.out.println("M1-A");
	}
}
final class BB extends AA{
	@Override
	final void m1() {
		System.out.println("M1-B");
	}
}
public class Test {
	public static void main(String[] args) {
		BB b=new BB();
		b.m1();
		
	}

}
