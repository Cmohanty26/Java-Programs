package com.String;

import java.util.Scanner;


public class WithoutUsingBuildMethodRemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s1=sc.next();
		char[] a=s1.toCharArray();
		char[] b=new char[a.length];
		int k=1;
		for(int i=0;i<a.length;i++) {
			if(i==0) {
				b[i]=a[i];
				continue;
			}
			boolean flag=true;
			for(int j=0;j<i;j++) {
				if(a[i]==b[j]) {
					flag =false;
					break;
				}
			}
			if(flag==true) {
				b[k]=a[i];
				k++;
			}
			
		}
		 for (int i = 0; i < k; i++) {
	            System.out.print(b[i]);
	        }
		

	}

}
