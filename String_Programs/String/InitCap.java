package com.String;

import java.util.Scanner;

public class InitCap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			char ch=c[i];
			if(i==0 || c[i-1]==' ') {
				if(ch>='a' && ch<='z') {
					c[i]=(char)(c[i]-32);
				}
			}
		}
		System.out.println(c);

	}

}
