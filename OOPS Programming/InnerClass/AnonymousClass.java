package com.InnerClass;
class Thaeter{
	void popCorn() {
		System.out.println("Normal popcorn");
	}
}
public class AnonymousClass {

	public static void main(String[] args) {
		Thaeter t=new Thaeter();
		Thaeter t1=new Thaeter() {
			@Override
			void popCorn() {
				System.out.println("Salted Popcorn");
			}
		};
		t1.popCorn();
		new Thaeter() {
			@Override
			void popCorn() {
				System.out.println("Peri Peri pop Corn");
			}
		}.popCorn();
		System.out.println(t.getClass().getSimpleName());
		System.out.println(t.getClass().getName());
		

	}

}
