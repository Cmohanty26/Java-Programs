package com.String;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String s=sc.next();
		System.out.println("Enter the 2nd string");
		String s1=sc.next();
		if(isAnagram(s, s1)) {
			System.out.println("Both s and s1 are anagram string");
		}
		else {
			System.out.println("Both s and s1 are not anagram string");
		}

	}
	public static boolean isAnagram(String s,String s1) {
		while(true) {
			if(s.length()!=s1.length())return false;
			if(s.length()==0 && s1.length()==0)return true;
			char c=s.charAt(0);
			s=s.replace(c+"", "");
			s1=s1.replace(c+"", "");
		}
	}

}
