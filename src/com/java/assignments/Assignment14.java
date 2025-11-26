package com.java.assignments;

public class Assignment14 {

	public static void main(String[] args) {
		// java program to check whether number is palindrome or not
		int n = 1221;
		int rev = 0;
		int num = n;

		for (;n>0;n/= 10) {
			rev = (rev * 10) + (n % 10);
			
		}

		System.out.println("the reverse of the number is :" + rev);
		if (rev == num) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}

	}

}

/*
 * 1221 > 0 (true)
 * rev = (0*10) + (1221%10) = 1
 * n = 122
 * 
 * 122 > 0 (true)
 * rev = (1*10) + (122%10) = 12
 * n = 12
 * 
 * 12 > 0 
 * rev = (12*10) + (12%10) = 122
 * n = 1
 * 
 * 1>0
 * rev = (122*10) + (1%10) = 1221
 * n = 0
 * 
 *
 */