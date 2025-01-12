package com.iteratotprogram;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner("jspider present at near airport");
		sc.useDelimiter(" ");
		int count=0;
		while(sc.hasNext()) {
			sc.next();
			count++;
			
			
		}
		System.out.println(count);
		sc.close();
		

	}

}
