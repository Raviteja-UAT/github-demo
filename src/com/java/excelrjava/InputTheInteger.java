package com.java.excelrjava;
import java.util.Scanner;

public class InputTheInteger {
    public static void main(String[] args) {
        //create a reader instance which takes input from the standard input - keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        // nextInt() reads the next integer from the keyboard
        int num = sc.nextInt();
        // println() prints the following line to the output screen
        System.out.println("you entered: " + num);

    }
}
