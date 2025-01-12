package com.SteamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateList {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,1,2,3,4);
		List<Integer>l=list.stream().distinct().collect(Collectors.toList());
		System.out.println(l);

	}

}
