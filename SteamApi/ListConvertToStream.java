package com.SteamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListConvertToStream {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer>list=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list);

	}

}
