package com.ListIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		List l=new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		ListIterator itr=l.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=============");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
