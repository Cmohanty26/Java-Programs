package com.DeadLock;

public class ConsumeThread implements Runnable{
	int items;
	public ConsumeThread(int items) {
		this.items=items;
		new Thread(this).start();
	}
	public void run() {
		System.out.println("consume thread starts");
		Stock.getInstance().consume(items);
	}
	

}
