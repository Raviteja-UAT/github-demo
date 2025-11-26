package com.java.oopsprograms;

public class Dog implements Animal{

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();

	}

	@Override
	public void bark() {
		System.out.println("boww boww");
		
	}

}



/*
*Write a Java program to create a class called Employee with methods called work() and getSalary(). 
*Create a subclass called HRManager that overrides the work() method
* and adds a new method called addEmployee().

Write a Java program to create a Animal interface with a method called bark()
 that takes no arguments and returns void. Create a Dog class that implements Animal 
 and overrides speak() to print "Dog is barking".




*/