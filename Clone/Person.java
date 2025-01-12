package com.Clone;

public class Person implements  Cloneable{
	String name;
	int age;
	long mobile;
	Address address;
	public Person(String name, int age, long mobile, Address address) {
		
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", mobile=" + mobile + ", address=" + address + "]";
	}
	public Object clone() throws CloneNotSupportedException {
		//return super.clone();
		Person p=(Person)super.clone();
		p.address=(Address)address.clone();
		return p;
	}
	
	

}
