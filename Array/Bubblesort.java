package com.Array;

public class Bubblesort {

	public static void main(String[] args) {
		int[] a= {6,8,3,1,7,4,2};
		for(int j=0;j<a.length-1;j++) {
			for(int i=0;i<a.length-1-j;i++) {
				if(a[i]>a[i+1]) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
						
			
			
		}
		System.out.print("Sorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
		
		

	}

}
