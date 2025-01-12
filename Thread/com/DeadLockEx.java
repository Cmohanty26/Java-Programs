package Thread.com;
class C{
	synchronized void m1(B b) {
		System.out.println("M1-A");
		System.out.println("A class is calling B class T2 method");
		b.t2();
	}
	synchronized void t1() {
		System.out.println("T1-A");
	}
}
class B{
	synchronized void m2(C a) {
		System.out.println("M2-B");
		System.out.println("B class is calling A class T1 method");
		a.t1();
	}
	synchronized void t2() {
		System.out.println("T2-B");
	}
}
class Mythread6 extends Thread{
	C a=new C();
	B b=new B();
	@Override
	public void run() {
		a.m1(b);
	}
	void help() {
		b.m2(a);
	}
}

public class DeadLockEx {

	public static void main(String[] args) {
		Mythread6 t1=new Mythread6();
		t1.start();
		t1.help();
		

	}

}
