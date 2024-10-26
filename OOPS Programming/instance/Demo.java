package com.instance;
class Animal{
	
}
class Dog extends Animal{
	
}
class BabyDog extends Dog{
	
}
class Cat extends Animal{
	
}
public class Demo {

	public static void main(String[] args) {
		Animal a=new Dog();
		System.out.println(a instanceof Dog);//true
		System.out.println(a instanceof Animal);//true
		System.out.println(a instanceof BabyDog);//false
		System.out.println(a instanceof Cat);//false
		System.out.println("---------------------------");
		Dog d=new BabyDog();
		System.out.println(d instanceof Dog);//true
		System.out.println(d instanceof Animal);//true
		System.out.println(d instanceof BabyDog);//true
		System.out.println("---------------------------");
		Animal a1=new BabyDog();
		System.out.println(a1 instanceof Dog);//true
		System.out.println(a1 instanceof Animal);//true
		System.out.println(a1 instanceof BabyDog);//true
		System.out.println(a1 instanceof Cat);//false
		

	}

}
