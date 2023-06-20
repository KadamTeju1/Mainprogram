package com.bridgelabz.basic;

public class Reversefor {
    public static void main(String[] args) {


        int number = 1234;
        int rev = 0, reminder;

        for (; number != 0; number = number / 10)
        {
            reminder= number % 10;
            rev = rev * 10 + reminder;


        }
        System.out.println("Reverse number:" + rev);
    }
}
