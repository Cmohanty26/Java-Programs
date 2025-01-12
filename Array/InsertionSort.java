package com.Array;

import java.util.Arrays;

import com.String.Sorted;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a= {8,4,6,1,2,9,3};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
		

	}
	public static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
