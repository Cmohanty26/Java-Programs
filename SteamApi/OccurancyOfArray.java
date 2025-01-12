package com.SteamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurancyOfArray {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,7,8,8);
		Map<Integer, Long>m=l.stream().
				collect(Collectors.groupingBy(c->c,Collectors.counting()));
		m.forEach((ch,i)->System.out.println(ch+"="+i));

	}

}
