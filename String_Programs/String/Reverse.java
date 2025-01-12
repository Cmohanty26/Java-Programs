package com.String;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		System.out.println(reverse(s));

	}
	public static String reverse(String s) {
		char[] c=s.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<j) {
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
			
		}
		return new String(c);
	}

}
