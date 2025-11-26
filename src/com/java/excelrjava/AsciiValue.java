package com.java.excelrjava;


public class AsciiValue {
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = ch;
        int castAcii = (int)ch;

        //printing the ascii value of the given character
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAcii);
    }
}
