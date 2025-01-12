package com.String;

import java.util.Scanner;

public class CountTheCharAndNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s1=sc.next();
		char[] a=s1.toCharArray();
		int i=0;
		String s2="";
		while(i<a.length) {
			char c=a[i];
			int count=1;
			i++;
			while(i<a.length && a[i]==c) {
				count++;
				i++;
			}
			s2=s2+c+count;
		}
		System.out.println(s2);

	}

}
