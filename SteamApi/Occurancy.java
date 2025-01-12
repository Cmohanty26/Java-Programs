package com.SteamApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Occurancy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		Map<Character, Long>m=s.chars().
				mapToObj(c->(char)c).
				collect(Collectors.groupingBy(c->c,()->
				new LinkedHashMap<Character,Long>(),
				Collectors.counting()));
		m.forEach((ch,i)->System.out.println(ch+"="+i));

	}

}
