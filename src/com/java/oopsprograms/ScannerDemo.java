package com.java.oopsprograms;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// program to illustrate the usage of scanner class
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the new number");
		int num = sc.nextInt();
		System.out.println("value of new number : "+ num);

	}

}
