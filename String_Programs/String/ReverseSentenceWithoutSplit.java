package com.String;

public class ReverseSentenceWithoutSplit {

	public static void main(String[] args) {
		String s="java is easy";
		String s2="";
		int i=0;
		while(i<s.length()) {
			int j=i;
			while(j<s.length() && s.charAt(j)!=' ') {
				j++;
			}
			for(int k=j-1;k>=i;k--) {
				s2=s.charAt(k)+s2;
			}
			if(j<s.length()) {
				s2=" "+s2;
			}
			i=j+1;
		}
		System.out.println(s2);

	}
	

}
