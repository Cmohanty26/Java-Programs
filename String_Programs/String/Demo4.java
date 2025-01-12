package com.String;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		Circle[] a= {
				new Circle(40),
				new Circle(20),
				new Circle(10),
				new Circle(30)
		
		};
		Arrays.sort(a);
		for(Circle c:a) {
			System.out.println(c);
		}

	}

}
