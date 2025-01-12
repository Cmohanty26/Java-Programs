package com.String;

import java.util.Scanner;

public class AddTotalNo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		System.out.println(add(s));
		

	}
	public static int add(String s) {
		int i=0;
		int sum=0;
		String s1="";
		char[] a=s.toCharArray();
		while(i<a.length) {
			s1="";
			while(i<a.length && a[i]>='0' && a[i]<='9') {
				s1+=a[i];
				i++;
				
			}
			if(s1.length()>0) {
				sum+=Integer.parseInt(s1);
				
				
			}
			i++;
			
		}
		return sum;
		
	}

}
