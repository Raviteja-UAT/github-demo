package com.java.assignments;

public class Assignment8 {

	public static void main(String[] args) {
		// Grade evaluator program based on marks

		int marks = 80;

		if (marks >= 80 && marks <= 100) {
			System.out.println("A grade");
		} else if (marks >= 60 && marks <= 80) {
			System.out.println("B grade");
		} else if (marks >= 40 && marks <= 60) {
			System.out.println("C grade");
		} else {
			System.out.println("fail");
		}

	}

}
