package com.Polymorphism;
interface Sim{
	void call();
}
class Airtel implements Sim{

	@Override
	public void call() {
		System.out.println("connected to Airtel");
		
	}
	
}
class JIO implements Sim{

	@Override
	public void call() {
		System.out.println("Connecteḍ to JIO");
		
	}
	
}
class BSNL implements Sim{

	@Override
	public void call() {
		System.out.println("Connected to BSNL");
		
	}
	
}
class Phone{
	Sim s;
	public Phone(Sim s){
		this.s=s;
		
	}
	void connect() {
		s.call();
	}
}
public class Demo {

	public static void main(String[] args) {
		Phone p=new Phone(new JIO());
		p.connect();
		

	}

}
