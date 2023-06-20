package com.bridgelabz.basic;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=123,rev=0,r=0;
        //int temp=number;
        while(number!=0)
        {
            r=number%10;
            rev=rev*10+r;
            number=number/10;

        }
        System.out.println("Reverse number"+rev);
    }
}
