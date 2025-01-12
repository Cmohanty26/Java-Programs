package com.comparable;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		Circle[] arr= {
				new Circle(50),
				new Circle(10),
				new Circle(20),
				new Circle(30)
				
		};
		Arrays.sort(arr);
		for(Circle t:arr) {
			System.out.println(t);
			
		}
		}

	}


