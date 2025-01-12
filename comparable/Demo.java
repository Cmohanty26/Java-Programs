package com.comparable;

import java.util.Arrays;

import com.comparator.Emp;

public class Demo {

	public static void main(String[] args) {
		Emp[] arr= {
				new Emp("Chandan", 876253.2),
				new Emp("Situ", 837312.2),
				new Emp("Rajib", 454298.2),
				new Emp("Lipun", 156122.2)
				
		};
		Arrays.sort(arr);
		for(Emp e:arr) {
			System.out.println(e);
		}

	}

}
