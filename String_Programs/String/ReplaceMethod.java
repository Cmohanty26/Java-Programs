package com.String;

public class ReplaceMethod {

	public static void main(String[] args) {
		String s1="javadeveloper";
		/*String s2=s1.replace('e', '@');
		System.out.println(s2);
		String s3=s1.replace("e", "");
		System.out.println(s3);
		String s4=s1.replace("velo", "VELO");
		System.out.println(s4);*/
		String s2=s1.replace("e", "");
		int count=s1.length()-s2.length();
		System.out.println(count);

	}

}
