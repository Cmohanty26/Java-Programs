package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurancy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		Map<Character, String> m=new LinkedHashMap<Character, String>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!m.containsKey(ch)) {
				m.put(ch, i+"");
			}
			else {
				m.put(ch, m.get(ch)+","+i);
			}
			
		}
		System.out.println(m);

	}

}
