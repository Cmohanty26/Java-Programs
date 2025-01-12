package com.iteratotprogram;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Example3 {

	public static void main(String[] args) {
		List<Integer>a=Arrays.asList(39,54,19,40,50,10);
		ListIterator<Integer>l=a.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("-----------------");
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}

	}

}
