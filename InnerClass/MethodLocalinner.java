package com.InnerClass;

public class MethodLocalinner {

	public static void main(String[] args) {
		class C{
			public void m1(int a,int b) {
				System.out.println(a+b);
			}
		}
		C c=new C();
		c.m1(20, 30);

	}

}
