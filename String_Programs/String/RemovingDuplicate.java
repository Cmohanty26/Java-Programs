package com.String;

import java.util.Scanner;

public class RemovingDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s1=sc.next();
		String s2="";
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			//Using contains()
			/*if(!s2.contains(c+"")) {
				s2+=c;
			}*/
			//Using IndexOf()
			if(s2.indexOf(c)==-1) {
				s2+=c;
			}
			
		}
		System.out.println(s2);

	}

}
