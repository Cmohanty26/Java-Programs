package com.String;

public class InitCap1 {

	public static void main(String[] args) {
		System.out.println(convert("chandan mohanty"));
		

	}
	public static String convert(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]>='a' || ch[i]<='z') {
				if(i==0 || ch[i-1]==' ') {
					ch[i]=(char)(ch[i]-32);
				}
				
			}
		}
		return new String(ch);
	}

}
