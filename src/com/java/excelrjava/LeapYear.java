package com.java.excelrjava;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2007;
        // if this year is multiple of 400
        // then it is a leap year
        if (year % 400 == 0)
            System.out.println("Leap year");
        // Else if a year is multiple of 100
        // then it is not a leap year
        else if (year % 100 == 0)
            System.out.println("Not leap year");
        // Else if a year is multiple of 4
        // then it is a leap year
        else if (year % 4 == 0)
            System.out.println("Leap year");
        else
            System.out.println("not a leap year");




    }
}
