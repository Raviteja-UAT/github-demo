package com.java.assignments;

public class Assignment13 {

	public static void main(String[] args) {
		// program to count the multiples of 3
		
		int count = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
