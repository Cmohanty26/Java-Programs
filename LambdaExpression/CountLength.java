package com.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CountLength {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("Chandan","Rajib","Priti Ranjan","lipun");
		Function<String, Integer>fn=i->i.length();
		for(String s:list) {
			System.out.println(fn.apply(s));
		}

	}

}
