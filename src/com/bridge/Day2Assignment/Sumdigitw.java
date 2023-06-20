package com.bridgelabz.basic;

public class Sumdigitw {
    public static void main(String a[])
    {
        int number=1234,sum=0;
        while(number!=0)
        {
            sum=sum+number%10;
            number=number/10;
        }
        System.out.println("sum of digit:"+sum);
    }
}
