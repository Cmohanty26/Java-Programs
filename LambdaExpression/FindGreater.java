package com.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FindGreater {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("Amaran","maran","ram","mar","raman");
		Predicate<String>p=i->i.length()>=5;
		for(String s:list) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}

	}

}
