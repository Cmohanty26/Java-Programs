package com.WrapperClass;

public class AutoUnboxing {

	public static void main(String[] args) {
		Integer a=20;
		int b=a.intValue();
		//before 1.5(AutoBoxing)
		System.out.println("Non-Primitive: "+a);
		System.out.println("Primitive: "+b);
		Integer n=30;
		int c=n;
		int i=new Integer(40);
		//After 1.5(AutoBoxing)
		System.out.println("Non-primitive: "+n);
		System.out.println("Primitive : "+c);
		System.out.println("Primitive : "+i);
	}

}
