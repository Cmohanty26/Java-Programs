package com.String;

import java.util.Scanner;

public class EnCoding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		String encoder=encoding(s, 12);
		System.out.println(encoder);

	}
	public static String encoding(String s,int l) {
		char[] a=s.toCharArray();
		char[] letter="abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		for(int i=0;i<a.length;i++) {
			char c=a[i];
			a[i]=letter[((c-97)+l)%26];
		}
			return new String(a);
		}
		
	}


