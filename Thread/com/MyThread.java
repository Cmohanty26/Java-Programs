package Thread.com;

 class Myclass extends Thread{
	 public void run() {
		 for(int i=1;i<=10;i++) {
			 System.out.println("my thread:"+i);
		 }
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	 }
	
}
public class MyThread {

	public static void main(String[] args) throws InterruptedException {
		Myclass c=new Myclass();
		c.start();
		for(int i=1;i<=10;i++) {
			System.out.println("main thread: "+i);
			Thread.sleep(1000);
			
		}


	}

}
