package com.String;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		int end=s.length()-1;
		permutation(s,0,end);
		

	}
	public static void permutation(String s,int start,int end) {
		if(start>=end) {
			System.out.println(s);
			return ;
		}
		for(int i=start;i<=end;i++) {
			String s1=swap(s,start,i);
			permutation(s1, start+1, end);
		}
	}
	public static String swap(String s,int i,int j) {
		char[] c=s.toCharArray();
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		return new String(c);
		
	}

}
