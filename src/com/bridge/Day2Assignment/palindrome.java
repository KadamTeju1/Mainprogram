package com.bridgelabz.basic;

public class palindrome {
    public static void main(String[] args) {
        int number=121,sum=0,r;
        int temp=number;
        for(int i=0;i<number;number=number/10)
        {
            r=number%10;
            sum=sum*10+r;
        }
        if(temp==sum)
        {
            System.out.println("Given number is palindrome");
        }
        else
        {
            System.out.println("Given number is not palindrome");
        }
    }
}
