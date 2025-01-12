package com.LambdaExpression;

public class Emp {
	String name;
	int age;
	double sal;
	int empId;
	public Emp(String name, int age, double sal, int empId) {
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", sal=" + sal + ", empId=" + empId + "]";
	}
	
	

}
