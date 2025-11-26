package com.java.assignments;

import java.util.ArrayList;
import java.util.HashSet;

public class Assignment25 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
	    list.add('a');
	    list.add('b');
	    list.add('b');
	    list.add('d');
	    list.add('c');
	    list.add('c');
	    
	    HashSet<Character> set = new HashSet<Character>(list);
	    System.out.println(set);
	    

	}

}
