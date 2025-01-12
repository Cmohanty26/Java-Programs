package com.String;

public class ReverseSentence {

	public static void main(String[] args) {
		String s="java is easy";
		String str[]=s.split(" ");
		String temp="";
		for(int i=str.length-1;i>=0;i--) {
			temp+=str[i];
			temp+=" ";
			
		}
		System.out.println(temp);
		

	}

}
