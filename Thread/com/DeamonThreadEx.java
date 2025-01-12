package Thread.com;
class Thread2 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child-Thread:"+i);
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				
			}
		}
	}
}
public class DeamonThreadEx {

	public static void main(String[] args) throws InterruptedException {
		Thread2 t1=new Thread2();
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		t1.start();
		for(int i=1;i<=10;i++) {
			if(i==5) 
				System.out.println(i/0);
				System.out.println("Main_"+i);
				Thread.sleep(500);
			
		}
		

	}

}
