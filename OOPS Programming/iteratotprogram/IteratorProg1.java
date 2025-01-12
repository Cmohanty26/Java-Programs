package com.iteratotprogram;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorProg1 {

	public static void main(String[] args) {
	List<Integer> a=new ArrayList<Integer>();
	a.add(30);
	a.add(70);
	a.add(10);
	a.add(20);
	a.add(90);
	a.add(80);
	Iterator<Integer> i=a.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}

}
