package Thread.com;
class Thread3 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child class "+i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				
			}
		}
		
	}
	
}

public class RunnableExample {

	public static void main(String[] args) throws InterruptedException {
		Thread3 t1=new Thread3();
		Thread t=new Thread(t1);
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("main thread: "+i);
			Thread.sleep(1000);
			
		}
		Thread.sleep(1000);
		

	}

}

