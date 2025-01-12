package com.String;

import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		int countVowel=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				countVowel++;
			}
		}
		System.out.println("The count vowel is: "+ countVowel);

	}

}
