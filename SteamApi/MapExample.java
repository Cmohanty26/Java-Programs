package com.SteamApi;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("Ram","sita","Raman","Amaran","Boxer");
		list.stream().filter(i->i.length()>=5)
		.map(i->i.toUpperCase()).forEach(s->System.out.println(s));
		

	}

}
