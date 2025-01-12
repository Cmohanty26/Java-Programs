package com.abstraction;

public class Demo {

	public static void main(String[] args) {
		Shape s;
		s=new Rectangle("black", 10, 20);
		s.display();
		s.getArea();
		s=new Circle("green", 5);
		s.display();
		s.getArea();
		

	}

}
abstract class Shape{
	String color;

	public Shape(String color) {
		this.color = color;
	}
	abstract public void display();
	abstract public void getArea();
	
}
class Rectangle extends Shape{
	int length;
	int breadth;
	public Rectangle(String color, int length, int breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void display() {
		System.out.println("The length is: "+length);
		System.out.println("The breadth is: "+breadth);
	}
	@Override
	public void getArea() {
		int area=length*breadth;
		System.out.println("The area is: "+area);
	}
	
}
class Circle extends Shape{
	int radius;

	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}
	@Override
	public void display() {
		System.out.println("The radius is "+ radius);
	}
	@Override
	public void getArea() {
		double area=Math.PI*radius*radius;
		System.out.println("The area of circle is: "+area);
	}
}
