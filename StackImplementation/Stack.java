package com.StackImplementation;

public class Stack {
	int count=0;
	Node head;
	//Push()
	public void push(Object ele) {
		if(head==null) {
			head=new Node(ele);
			count++;
			return;
		}
		head=new Node(ele,head);
		count++;
	}
	//size()
	public int size() {
		return count;
	}
	//isEmpty()
	public boolean isEmpty() {
		return count==0;
	}
	//peek()
	public Object peek() {
		if(head==null) 
			throw new NullPointerException();
		return head.ele;
	}
	//pop
	public Object pop() {
		if(head==null) {
			throw new NullPointerException();
		}
		Object ele=head.ele;
		head=head.next;
		count--;
		return ele;
	}

}
