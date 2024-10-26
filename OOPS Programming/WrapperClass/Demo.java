package com.WrapperClass;

public class Demo {
	public static void main(String[] args) {
		int a=10;
		Integer b=20;
		m1(a,b);
		m1(b,a);
		m2(a);
		
	}
	public static void m1(Integer a,int b) {
		System.out.println("M1(Integer): "+ a +","+b);
		
	}
	public static void m1(int i,Integer j) {
		System.out.println("M1(int): "+i+","+j);
		
	}
	public static int m2(Integer a) {
		return new Integer(a);
		
	}

}
