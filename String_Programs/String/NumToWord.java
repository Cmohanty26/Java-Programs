package com.String;

import java.util.Scanner;

public class NumToWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		pw((num/10000000),"croce ");
		pw((num/100000)%100,"lakhs ");
		pw((num/1000)%100,"thousand ");
		pw((num/100)%10,"hundred ");
		pw((num%100),"");
		

	}
	public static void pw(int num,String s) {
		String[] one= {"","One","Two","Three","Four","Five","Six",
				"Seven","Eight","Nine","Ten","Eleven","Tweleve",
				"Thirteen","Fourteen","Fifteen","Sixteen",
				"Seventeen","Eighteen","Nineteen"};
		String[] two= {"","","Twenty","Thirty","Fourty","Fifty",
				"Sixty","Seventy","Eighty","Nintey"};
		if(num<=19) {
			System.out.print(one[num]);
		}
		else {
			System.out.print(two[num/10]+" "+ one[num%10]);
		}
		if(num!=0) {
			System.out.print(s);
		}
	}

}
