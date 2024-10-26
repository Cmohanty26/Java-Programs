package com.UpCasting;
class Vehicle{
	
}
class BMW extends Vehicle{
	
}
class BMWX extends BMW{
	
}
class BENZ extends Vehicle{
	
}
class AUDI extends Vehicle{
	
}
class Laptop{
	
}
public class Test1 {
	public static void driver(Vehicle v) {
		System.out.println("Driving....");
	}

	public static void main(String[] args) {
		driver(new BENZ());
		driver( new AUDI());
		driver(new BMW());
		driver(new BMWX());
		//driver(new Laptop());
		
		

	}

}
