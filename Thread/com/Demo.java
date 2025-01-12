package Thread.com;

class T1 extends Thread {
    T2 t2;

    public T1(T2 t2) {
        this.t2 = t2; 
    }

    public void run() {
        try {
            t2.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread t1=: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread t2=: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        T1 t1 = new T1(t2);

        t2.start(); 
        t1.start(); 

        t1.join();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread= " + i);
            Thread.sleep(500);
        }
    }
}
