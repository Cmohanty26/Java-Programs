package com.String;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]='$';
				}
			}
			
		}
		System.out.println(a);
		

	}

}
