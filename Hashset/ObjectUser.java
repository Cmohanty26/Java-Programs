package com.Hashset;

public class ObjectUser {

	public static void main(String[] args) {
		HashsetO s=new HashsetO();
		s.add("chandan");
		s.add(20);
		s.add('c');
		s.add("chandan");
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.traverse();

	}

}
