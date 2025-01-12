package Thread.com;
class MyThread1 extends Thread{
	
}
public class Test {

	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		System.out.println(t1.getName());
		t1.setName("Child-Thread");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		t1.setPriority(9);
		System.out.println(t1.getPriority());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		

	}

}
