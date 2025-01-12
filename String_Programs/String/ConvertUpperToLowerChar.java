package com.String;

import java.util.Scanner;

public class ConvertUpperToLowerChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]>='A' && a[i]<='Z') {
				a[i]=(char)(a[i]+32);
			}
			else if(a[i]>='a' && a[i]<='z') {
				a[i]=(char)(a[i]-32);
			}
			System.out.print(a[i]);

		}
		
	}

}
