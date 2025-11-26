package com.java.assignments;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		// java program to perform arithmatic operation :-

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a ");
		int a = sc.nextInt();
		System.out.println("enter the value of b ");
		int b = sc.nextInt();

		System.out.println("enter the options you want to perform operation ");
		String op = sc.next();

		switch (op) {

		case "add":
			System.out.println(a + b);
			break;
		case "mul":
			System.out.println(a * b);
			break;
		case "div":
			System.out.println(a / b);
			break;
		case "sub":
			System.out.println(a - b);
			break;
		case "mod":
			System.out.println(a % b);
			break;

		default:
			System.out.println("invalid");
			break;
		}

	}

}
