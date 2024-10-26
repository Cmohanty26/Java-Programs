package com.MethodOverloading;
class Bank{
	int rateofInterest() {
		return 0;
	}
}
class SBI extends Bank{
	int rateofInterest() {
		return 5;
	}
	
}
class ICICI extends Bank{
	int rateofInterest() {
		return 7;
	}	
}
public class Loan {

	public static void main(String[] args) {
		ICICI i=new ICICI();
		System.out.println(i.rateofInterest());
		SBI s=new SBI();
		System.out.println(s.rateofInterest());
		

	}

}
