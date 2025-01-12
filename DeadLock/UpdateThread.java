package com.DeadLock;

public class UpdateThread implements Runnable{
	int items;
	public UpdateThread(int items) {
		this.items=items;
		new Thread(this).start();
	}
	public void run() {
		System.out.println("update thread starts");
		Stock.getInstance().update(items);
	}
	

}
