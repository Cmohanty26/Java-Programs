package com.Hashset;

public class StudentUser {

	public static void main(String[] args) {
		Student s1=new Student("pavan", 49);
		Student s2=new Student("chandan", 57);
		Student s3=new Student("pavan", 49);
		Student s4=new Student("rajib", 60);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		HashsetO s=new HashsetO();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		System.out.println("size is: "+ s.size());
		s.traverse();

	}

}
