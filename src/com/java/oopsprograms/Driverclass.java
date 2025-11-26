package com.java.oopsprograms;

class Bike{
	
	String colour;
	double price;
	int model;
	String brand;
	
	void displayDetails() {
		System.out.println(colour);
		System.out.println(price);
		System.out.println(model);
		System.out.println(brand);
	}
}



public class Driverclass {

	public static void main(String[] args) {
		
		Bike b1 = new Bike();
		b1.colour = "black";
		b1.price = 1566534;
		b1.model = 2020;
		b1.brand = "Royal Enfield";
		
		b1.displayDetails();
		
		
	}

}
