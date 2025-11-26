package com.java.assignments;

import java.util.ArrayList;

public class Assignment23 {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add(20);
		al.add("excelR");
		al.add("java");
		
		System.out.println(al);
		
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		
		for(Object el : al) {
			System.out.println(el);
		}
		

	}

}
//ascending decsending max min