package com.LambdaExpression;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class AddAnotherEmp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		Emp[] emp=new Emp[n];
		Consumer<Emp> cs=e->
		System.out.println("Name:"+e.name+"\n"+"Age:"+e.age+"\n"+
		"Sal:"+ e.sal+"\n"+"empId "+e.empId);
		for(int i=0;i<n;i++) {
			System.out.println("Enter emp Details");
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the age");
			int age=sc.nextInt();
			System.out.println("Enter the salary");
			double sal=sc.nextDouble();
			System.out.println("Enter the empid");
			int empId=sc.nextInt();
			Supplier<Emp> sp=()->new Emp(name, age, sal, empId);
			emp[i]=sp.get();
			System.out.println("Emp added");
		}
		for(Emp em:emp) {
			cs.accept(em);
		}

	}

}
