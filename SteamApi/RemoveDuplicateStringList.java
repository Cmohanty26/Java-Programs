package com.SteamApi;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateStringList {

	public static void main(String[] args) {
		List<String>l=Arrays.asList("java","java","c++","python");
		l.stream().distinct().forEach(s->System.out.println(s));

	}

}
