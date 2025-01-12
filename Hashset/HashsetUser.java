package com.Hashset;

public class HashsetUser {

	public static void main(String[] args) {
		Hashset s=new Hashset();
		s.add(20);
		s.add(30);
		s.add(96);
		s.add(97);
		s.add(96);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.traverse();
		

	}

}
