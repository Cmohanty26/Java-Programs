package com.Hashset;

public class Student {
	String name;
	int mark;
	public Student(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + mark + "]";
	}
	public int hashCode() {
		return mark;
	}
	public boolean equals(Object arg) {
		if(!(arg instanceof Student))return false;
		Student s=(Student)arg;
		return name.equals(s.name) && mark==s.mark;
	}

}
