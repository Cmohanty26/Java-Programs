package com.String;

import java.util.Scanner;

public class DeCoding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		String decod=decoding(s, 10);
		System.out.println(decod);
		

	}
	public static String decoding(String s,int l) {
		char[] a=s.toCharArray();
		char[] letter="abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i=0;i<a.length;i++) {
			char c=a[i];
			a[i]=letter[((c-97)-l+26)%26];
			
		}
		return new String(a);
		
	}

}
