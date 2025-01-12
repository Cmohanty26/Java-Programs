package com.String;

import java.util.Scanner;

public class BossProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='$';
					break;
				}
			}
		}
		System.out.println(ch);

	}

}
