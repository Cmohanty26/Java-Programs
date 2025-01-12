package com.DoubleLinkedList;
public class Test {
public static void main(String[] args) {
		DoubleLinkedList l=new DoubleLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(3,60);
		l.add(4,70);
		l.add(5,50);
		l.add(6,80);
		l.traverse();
		l.reverse();
		l.traverse();
		
		l.add(0,50);
		l.traverse();
		
		l.add(3,60);
		l.traverse();
		
		l.remove(0);
		l.traverse();
		
		l.remove(4);
		l.traverse();
	}
}
