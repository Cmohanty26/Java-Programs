package com.Clone;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1=new Person("Ram", 25, 8117889859l, new Address("Banglore", "India"));
		Person p2=(Person)p1.clone();
		System.out.println(p1);
		System.out.println(p2);
		p2.address.city="HYD";
		System.out.println(p1);
		System.out.println(p2);

	}

}
