package com.String;

import java.util.Scanner;

public class Sorted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char temp=' ';
			for(int j=i;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[j];
					ch[j]=ch[i];
					ch[i]=temp;
					
				}
			}
		}
		System.out.println(ch);

	}

}
