package com.BinarySearchTree;

public class BinarySearchTree {
	private Node root;
	private int count;
	private boolean flag;
	public boolean add(int key) {
		flag=true;
		root=addNode(root,key);
		return flag;
	}
	private Node addNode(Node n,int key) {
		if(n==null) {
			n=new Node(key);
			count++;
			return n;
		}
		if(key<n.key) {
			n.left=addNode(n.left, key);
		}
		else if(key>n.key){
			n.right=addNode(n.right, key);
			
		}
		else {
			flag=false;
		}
		return n;
	}

}
