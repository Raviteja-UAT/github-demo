package com.java.excelrjava;


public class AlphabetCheck {
    public static void main(String[] args) {
        char ch = '$';
        // using if else condition
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("Alphabet");
        }
        else {
            System.out.println("Not an Alphabet");
        }
    }
}
