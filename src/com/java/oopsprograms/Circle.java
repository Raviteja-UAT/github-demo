package com.java.oopsprograms;


class Shape{
	
	int r=5;
	
	void getArea() {
		System.out.println("Area of circle :" + (22/7*r*r));
	}
}
public class Circle extends Shape {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.getArea();

	}

}
