package com.String;

public class Circle implements Comparable{
	int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	public int compareTo(Object arg) {
		return this.radius-((Circle)arg).radius;
		
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	

	
	

}
