package com.java.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment24 {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("chikku");
		set.add("chikku");
		set.add("orange");

		System.out.println(set);

		ArrayList<String> fruits = new ArrayList<String>(set);
		System.out.println(fruits);
		Collections.sort(fruits);// ascending sort
		System.out.println(fruits);
		Collections.sort(fruits, Collections.reverseOrder());// descending sort
		System.out.println(fruits);
		Collections.shuffle(fruits);
		System.out.println(fruits);
		
		String str1= fruits.get(1);
		System.out.println(str1);

	}

}


//take list of multiple duplicate list
//remove duplicate