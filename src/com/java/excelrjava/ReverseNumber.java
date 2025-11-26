package com.java.excelrjava;

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 1234;
        int temp = num;
        int rev=0;
        int sum = 0;

        while (num>=0)
        {
            int rem = num%10;
            rev = rev*10+rem;
            sum = sum + rev;

        }

        if (temp == sum)
        {

        }
        else
        {

        }
    }
}


/*
reverse a number
palindromic number
count number of digits in a number
count number of even and odd digits in a number
find sum of digits in a number
 */