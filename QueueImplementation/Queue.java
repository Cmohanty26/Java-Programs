package com.QueueImplementation;

public class Queue {
	Node head;
	Node tail;
	int count=0;
	//Add()
	public void add(Object ele) {
		Node n=new Node(ele);
		if(head==null) {
			head=n;
			tail=head;
			count++;
			return;
		}
		tail.next=n;
		tail=tail.next;
		count++;
	}
	//size()
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
	//peek()
	public Object Peek() {
		if(head==null)
			throw new NullPointerException();
		return head.ele;
	}
	//poll
	public Object poll() {
		if(head==null) {
			throw new NullPointerException();
		}
		else {
			Object ele=head.ele;
			head=head.next;
			count--;
			return ele;
		}
	}

}
