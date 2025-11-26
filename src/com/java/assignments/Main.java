package com.java.assignments;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(3);
    list.add(3);
    
    HashSet<Integer> set = new HashSet<Integer>(list);
    System.out.println(set);
  }
}


//take char collection , take first non repeating characters using map
//Find second highest number in a list