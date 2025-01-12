package com.String;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				count++;
			}
		}
		System.out.println(count);

	}

}
