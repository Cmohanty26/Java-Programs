package com.String;

import java.util.Scanner;

public class AddNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		char[] c=s.toCharArray();
		int sum=0;
		
		for(char a:c) {
			if(a>='0' && a<='9') {
				sum+=a-'0';
			}
			
		}
		System.out.println(sum);

	}

}
