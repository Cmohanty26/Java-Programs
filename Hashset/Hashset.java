package com.Hashset;

public class Hashset {
	private int count=0;
	private Node1[]a=new Node1[10];
	public boolean add(int key) {
		int index=key%a.length;
		index=Math.abs(index);
		if(a[index]==null) {
			a[index]=new Node1(key, null);
			count++;
			return true;
		}
		Node1 curr=a[index];
		Node1 prev=null;
		while(curr!=null) {
			if(key==curr.key)return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node1(key, null);
		count++;
		return true;
	}
	//Size()
	public int size() {
		return count;
	}
	//isEmpty()
	public boolean isEmpty() {
		return count==0;
	}
	//traverse
	public void traverse() {
		for(int i=0;i<a.length;i++) {
			Node1 curr=a[i];
			while(curr!=null) {
				System.out.print(curr.key+" ");
				curr=curr.next;
			}
			
		}
		System.out.println();
	}
	

}
