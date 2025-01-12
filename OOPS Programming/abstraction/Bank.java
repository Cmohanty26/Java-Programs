package com.abstraction;
interface Payble{
	void pay();
}
class SBI implements Payble{
	@Override
	public void pay() {
		System.out.println("Paid by using SBI");
	}
}
class ICICI implements Payble{

	@Override
	public void pay() {
		System.out.println("Paid by using ICICI");
		
	}
	
}
class AXIS implements Payble{

	@Override
	public void pay() {
		System.out.println("Paid by using Axis");
		
	}
	
}
class User{
	static void payment(Payble p) {
		p.pay();
	}
	
}
public class Bank {

	public static void main(String[] args) {
		User.payment(new ICICI());
		User.payment(new SBI());
	
		

	}

}
