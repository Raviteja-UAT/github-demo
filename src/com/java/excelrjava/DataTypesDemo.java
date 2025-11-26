package com.java.excelrjava;

public class DataTypesDemo {

    public static void main(String[] args) {

        //Numeric datatypes
        int a = 100, b=200;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);

        byte by = 120;
        System.out.println(by);

        short sh = 250;
        System.out.println(sh);

        long l = 1234567890L; //Literal is needed at the end of the value
        System.out.println(l);

        // Decimal number - float double

        float price = 150.5f; // Literal is needed at the end of the value
        System.out.println(price);

        double item_price = 145.3242342;
        System.out.println(item_price);

        // Character
        char grad = 'B';
        System.out.println("The grade of the student is :" + grad);

        // boolean - allowed only true / false
        boolean bool = true;
        System.out.println(bool);

        // String
        String name = "john";
        System.out.println(name);





    }
}
