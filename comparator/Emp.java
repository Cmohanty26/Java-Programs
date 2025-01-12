package com.comparator;

public class Emp implements Comparable{
	String name;
	public double sal;
	public Emp(String name,double sal) {
		this.name=name;
		this.sal=sal;
	}
	public int compareTo(Object arg) {
		Emp e=(Emp)arg;
		if(sal>e.sal)return 1;
		if(sal<e.sal)return -1;
		return 0;
		//return name.compareTo(e.name);
		
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", sal=" + sal + "]";
	}
	
	

}
