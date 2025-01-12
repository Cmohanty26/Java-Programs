package com.SteamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateUsingStreamApi {

	public static void main(String[] args) {
		String s="Happy Happy Birthday Happy";
		String[] str=s.split(" ");
		List<String>l=Arrays.asList(str);
		List<String> list=l.stream().distinct().collect(Collectors.toList());
		String result = String.join(" ", list);
        System.out.println(result);
				

	}

}
