package com.String;

import java.util.Scanner;

public class IncreaseNoAndChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		char[] a=s.toCharArray();
		int i=0;
		while(i<a.length) {
			char c=a[i];
			i++;
			char count=49;
			int j=i;
			if(a[i-1]>=48 && a[i-1]<=57)continue;
			while(j<a.length) {
				if(c==a[j]) {
					count++;
					a[j]=count;
				}
				j++;
			}
		}
		System.out.println(a);

	}

}
