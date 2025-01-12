package com.String;

public class PallendromeWords {

	public static void main(String[] args) {
		
	
		String s="madam is madam";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(isPallendrome(str[i])) {
				System.out.println(str[i]);
			}
		}

	}
	public static boolean isPallendrome(String s) {
		s=s.toLowerCase();
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
