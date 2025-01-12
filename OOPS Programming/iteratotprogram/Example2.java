package com.iteratotprogram;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		Set<String> s=new LinkedHashSet<String>();
		s.add("Rama");
		s.add("Dipu");
		s.add("Kiran");
		s.add("Chandan");
		s.add("Raja");
		Iterator<String>i2=s.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}

	}

}
