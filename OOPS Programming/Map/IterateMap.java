package com.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IterateMap {

	public static void main(String[] args) {
		Map<Integer, String>m=new TreeMap<Integer, String>();
		m.put(7, "Thala");
		m.put(18, "King");
		m.put(1, "Kl");
		m.put(45, "Rohit");
		m.put(31, "David");
		Set<Integer> s=m.keySet();
		Iterator<Integer>itr=s.iterator();
		while(itr.hasNext()) {
			int key=itr.next();
			String res=m.get(key);
			System.out.println(key+"="+res);
		}

	}

}
