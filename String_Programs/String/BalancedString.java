package com.String;

public class BalancedString {

	public static void main(String[] args) {
		System.out.println(isBalanced("[5+{4*(2+3)}]"));
		

	}
	public static boolean isBalanced(String args) {
		String s="";
		for(int i=0;i<args.length();i++) {
			char c=args.charAt(i);
			if(c=='[' || c==']' || c=='{'|| c=='}' || c=='(' || c==')') {
				s+=c;
			}
			while(s.contains("[]") || s.contains("{}") || s.contains("()")) {
				s=s.replace("[]", "");
				s=s.replace("{}", "");
				s=s.replace("()", "");
			}
		}
		return s.length()==0;
		
	}

}
