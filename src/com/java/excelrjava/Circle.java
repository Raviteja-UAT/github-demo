package com.java.excelrjava;

abstract class Shape {
	int r = 5;

	abstract void calculateArea();

	abstract void calculatePerimeter();
}

public class Circle extends Shape {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.calculateArea();
		c.calculateArea();

	}

	@Override
	void calculateArea() {
		System.out.println("Area : " + (22 / 7 * r * r));

	}

	@Override
	void calculatePerimeter() {
		System.out.println("Area of perimenter");

	}

}

/*
 * Write a Java program to create an abstract class Shape with abstract methods
 * calculateArea() and calculatePerimeter(). Create subclasses Circle and
 * Triangle that extend the Shape class and implement the respective methods to
 * calculate the area and perimeter of each shape.
 */