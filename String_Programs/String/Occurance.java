package com.String;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s1=sc.next();
		String s2="";
		int i=0;
		while(s1.length()>0) {
			char c=s1.charAt(0);
			s2=s1.replace(c+"", "");
			int count=s1.length()-s2.length();
			System.out.println(c+"="+count);
			s1=s2;
			
		}

	}

}
