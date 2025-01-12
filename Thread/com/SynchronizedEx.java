package Thread.com;
class A{
	public static synchronized void m1(String s) {
		for(int i=1;i<=10;i++) {
			System.out.println("Executed by=: "+s);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				
			}
		}
	}
}
class Mythread5 extends Thread{
	A a;
	String s;
	public Mythread5(A a, String s) {
		
		this.a = a;
		this.s = s;
	}
	public void run() {
		a.m1(s);
	}
	
}
public class SynchronizedEx {

	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		Mythread5 t1=new Mythread5(a1, "t1");
		Mythread5 t2=new Mythread5(a2, "t2");
		t1.start();
		t2.start();
		

	}

}
