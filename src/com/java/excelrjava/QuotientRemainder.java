package com.java.excelrjava;

public class QuotientRemainder {
    public static void main(String[] args) {
        //this program computes the quotient and remainder

        //declaring and initialising the dividend and divisor
        int dividend = 35;
        int divisor = 4;

        int quo = dividend/divisor;
        int rem = dividend%divisor;

        System.out.println("The quotient is : " + quo);
        System.out.println("The remainder is : " + rem);

    }
}
