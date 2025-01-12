package com.Array;

import java.util.Arrays;

public class SecondMax {

	public static void main(String[] args) {
		int[] a= {5,6,3,1,7,9,13,2};
//		Arrays.sort(a);
//		 System.out.println("Second Maximum: " + a[a.length - 2]);
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				secondlargest=largest;
				largest=a[i];
			}
			else if(a[i]>secondlargest && a[i]!=largest){
				secondlargest=a[i];
				
			}
		}
		System.out.println(secondlargest);

	}

}
