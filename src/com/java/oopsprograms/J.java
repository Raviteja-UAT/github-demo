package com.java.oopsprograms;

public class J {

	int a;
	static int b;
	public static void main(String[] args) {
		
		J j1 = new J();
		System.out.println(j1.a);//0
		System.out.println(j1.b);//0
		
		j1.a = 5;
		J.b = 10;
		System.out.println(j1.a);//5
		System.out.println(b);//10
		
		J j2 = new J();
		j2.a = 2;
		j2.b = 4;
		System.out.println(j2.a);
		System.out.println(j2.b);
		
		
		

	}

}
