package com.Final;

import java.util.Scanner;

public class Book {
	String name;
	String author;
	double price;
	public Book(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public void dispaly() {
		System.out.println(name+"\n"+author+"\n"+price);
	}
	public static Book createBook() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details");
		String name=sc.next();
		String author=sc.next();
		double price=sc.nextDouble();
		
		 return new Book(name, author, price);
	}
	
	

}
