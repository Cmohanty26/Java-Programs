package com.comparator;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Emp[] arr= {
				new Emp("Chandan",278901.2),
				new Emp("Lipun", 267181.1),
				new Emp("Rajib", 7812912.3),
				new Emp("Situ", 120000.3)
				
		};
		Arrays.sort(arr,new SalCompare());
		for(Emp e:arr) {
			System.out.println(e);
		}

	}

}
