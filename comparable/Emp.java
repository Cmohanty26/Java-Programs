package com.comparable;

import java.util.Comparator;



public class Emp implements Comparator{
	String name;
	public double sal;
	public Emp(String name,double sal) {
		this.name=name;
		this.sal=sal;
	}
	public int compareTo(Object arg) {
		Emp e=(Emp)arg;
		//if(sal>e.sal)return 1;
		//if(sal<e.sal)return -1;
		return name.compareTo(e.name);
		
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", sal=" + sal + "]";
	}
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
	
	
