package com.String;

public class SuccessExam {

	public static void main(String[] args) {
		String s="Success";
		String s1="";
		int i=0;
		char[] a=s.toCharArray();
		while(i<a.length) {
			char c=a[i];
			s1+=c;
			i++;
			while(i<a.length && c==a[i]) {
				s1+=c;
				i++;
			}
			if(s1.length()>1) {
				System.out.println(s1);
			}
			s1="";
		}

	}

}
