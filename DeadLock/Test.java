package com.DeadLock;

public class Test {

	public static void main(String[] args) {
		Stock s=Stock.getInstance();
		new UpdateThread(25);
		try {
			Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		new ConsumeThread(30);
		try {
			Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		new UpdateThread(25);

	}

}
