package com.LambdaExpression;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PerfectNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		Predicate<Integer>p=i->n%i==0;
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(p.test(i)) {
				sum+=i;
			}
		}
		Function<Integer, Boolean>fn=a->a==n;
		Consumer<Integer>cs=b->{
			if(fn.apply(b)) {
				System.out.println(n +" is a perfect no");
			}
			else {
				System.out.println(n +" is not a perfect no");
			}
			
		};
		cs.accept(sum);

	}

}
