package com.java.oopsprograms;

public class D {

	static int a = 1;

	public static void main(String[] args) {
		System.out.println(a);// 1
		int a = 10;
		System.out.println(a);// 10
		a = 100;
		System.out.println(a);// 100
		D.a = 1000;
		System.out.println(a);// 100
		System.out.println(D.a);// 1000

	}

}
