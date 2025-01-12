package com.Array;

public class SmallestElement {

	public static void main(String[] args) {
		int[] a= {3,7,1,4,6,2};
		int smallest=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println(smallest);

	}

}
