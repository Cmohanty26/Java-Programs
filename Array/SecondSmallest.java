package com.Array;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] a= {9,1,8,10,7,12};
		int smallest=a[0];
		int secondsmallest=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]==smallest)continue;
			if(a[i]<smallest) {
				secondsmallest=smallest;
				smallest=a[i];
			}
			else if(a[i]<secondsmallest || smallest==secondsmallest) {
				secondsmallest=a[i];
			}
			
		}
		System.out.println(secondsmallest);

	}

}
