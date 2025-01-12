package com.String;

import java.util.Scanner;

public class Pallendrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		if(isPallendrome(s)) {
			System.out.println("It Pallendrome String");
		}
		else {
			System.out.println("It not pallendrome String");
		}

	}
	public static boolean isPallendrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
		
	}

}
