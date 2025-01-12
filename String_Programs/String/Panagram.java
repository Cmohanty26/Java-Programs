package com.String;

public class Panagram {

	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog";
		if(isPanagram(s)) {
			System.out.println("It is a panagram string");
		}
		else {
			System.out.println("It is not a panagram string");
		}
	}
	public static boolean isPanagram(String s) {
		s=s.toLowerCase();
		if(s.length()<26)return false;
		for(char ch='a';ch<='z';ch++) {
			if(s.indexOf(ch)==-1)return false;
		}
		return true;
	}

}
