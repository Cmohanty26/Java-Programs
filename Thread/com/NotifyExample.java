package Thread.com;
class Account{
	int bal;
	 Account(int bal) {
		 this.bal=bal;
		
	}
	@Override
	public String toString() {
		return "Account [bal=" + bal + "]";
	}
	 public synchronized void withdraw(int amount) {
		 if(amount>bal) {
			 try {
				 System.out.println("less bal....");
				 wait();
			 }
			 catch(InterruptedException e) {
				 
			 }
		 }
		 bal-=amount;
		 System.out.println("withdraw done:"+amount);
	 }

	 public synchronized void deposite(int amount) {
		 bal+=amount;
		 notify();
		 System.out.println("Going to deposite :"+ amount);
	 }
}

public  class NotifyExample {

	public static void main(String[] args) throws InterruptedException {
		Account a=new Account(3000);
		new Thread() {
		@Override
		public void run() {
			a.withdraw(4000);
		}
		}
	.start();
	new Thread() {
		@Override
		public void run() {
			a.deposite(5000);
		}
	}
	.start();
	Thread.sleep(1000);
	System.out.println(a);
		

	}

}

