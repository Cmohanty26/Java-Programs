package com.SteamApi;

import java.util.Scanner;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		s.chars().distinct().mapToObj(i->(char)i).
		forEach(i->System.out.print(i));

	}

}
