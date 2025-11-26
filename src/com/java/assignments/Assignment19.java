package com.java.assignments;

public class Assignment19 {

    public static void main(String[] args) {
        // java program to count no.of vowels & consonants in the given string

        String str = "Hello World";
        str = str.toLowerCase().trim();
        
       

        
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

           
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            
            else  {
                consonantCount++;
            }
           
        }

      
        System.out.println("Total number of vowels: " + vowelCount);
        System.out.println("Total number of consonants: " + consonantCount);
    }
}
