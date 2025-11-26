package com.java.excelrjava;

public class WhileLoopDemo {

    public static void main(String[] args) {

        //Example1 : 1......10
        /*
        int i = 1; // initialization

        while (i<=10) //condition
        {
            System.out.println(i);
            i++; //incrementation
        }
        */

        //Example2 : 10.......1

       /* i = 10;
        while (i>=1)
        {
            System.out.println(i);
            i--;
        }

        */

        //Example 3 : print "Hello" message 10 times

        /*
        int i = 1;
        while (i<=10)
        {
            System.out.println(i + "."+ "Hello");
            i++;
        }

         */

        //Example 4 : print only even numbers from 1 to 10

       /* int i = 1;
        while (i<=20)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }

        */

        // method 2 :
        /*
        int i = 2;
        while (i<=10)
        {
            System.out.println(i);
            i = i+2;
        }
        */

        // print odd numbers : 1 to 10
        /*
        int i = 1;

        while(i<=10)
        {
            System.out.println(i);
            i = i+2;
        }
         */

        //method 2 :

        int i = 1;

        while (i<=10)
        {
            if (i%2!=0)
            {
                System.out.println(i);
            }
            i++;
        }


    }
}
