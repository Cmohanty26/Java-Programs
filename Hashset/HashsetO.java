package com.Hashset;

public class HashsetO {
	private Node[] a=new Node[10];
	private int count=0;
	public boolean add(Object key) {
		int index=key.hashCode()%a.length;
		index=Math.abs(index);
		if(a[index]==null) {
			a[index]=new Node(key,null);
			count++;
			return true;
		}
		Node curr=a[index];
		Node prev=null;
		while(curr!=null) {
			if(key.equals(curr.key))return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(key, null);
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
			Node curr=a[i];
			while(curr!=null) {
				System.out.print(curr.key+" ");
				curr=curr.next;
			}
		}
		System.out.println();
	}

}
