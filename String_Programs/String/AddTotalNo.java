package com.String;

import java.util.Scanner;

public class AddTotalNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		char[] c=s.toCharArray();
		int i=0;
		int sum=0;
		int n=0;
		while(i<c.length) {
			while(i<c.length && c[i]>='0' && c[i]<='9') {
				n=(n*10)+(c[i]-'0');
				i++;
			}
			sum+=n;
			n=0;
			i++;
		}
		System.out.println(sum);

	}

}
