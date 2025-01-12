package com.Array;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {3,7,4,1,8,9,23,10};
		System.out.println(search(a,4));
		System.out.println(search(a,12));

	}
	static int search(int[] a,int e) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==e) {
				return i;
			}
		}
		return -1;
	}

}
