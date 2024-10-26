package com.MethodOverloading;
class Animal{
	void makeSound() {
		System.out.println("sound of animal");
	}
}
class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("Bow BOww");
	}
}
class BabyDog extends Dog{
	@Override
	void makeSound() {
		System.out.println("Weeping...");
	}
}
class Cat extends Animal{
	
	void makeSound1() {
		System.out.println("meowwww");
	}
}
public class Demo {

	public static void main(String[] args) {
		
Dog d=new Dog();
d.makeSound();
Cat c=new Cat();
c.makeSound();
	}

}
