package com.String;

import java.util.Scanner;

public class ReverseWord1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String s2="";
		int i=0;
		while(i<s.length()) {
			int j=i;
			while(j<s.length() && s.charAt(j)!=' ') {
				j++;
			}
			for(int k=j-1;k>=i;k--) {
				s2+=s.charAt(k);
			}
			if(j<s.length()) {
				s2+=" ";
			}
			i=j+1;
		}
		System.out.println(s2);

	}

}
