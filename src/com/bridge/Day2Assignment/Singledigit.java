package com.bridgelabz.basic;

public class Singledigit {
    public static void main(String args[])
    {
        int n=2;
        int n1=n,n2=n;
        int b=n1%10,a=n2/10;
        String single_digits[]={"zero","one","two","three","four","five", "six","seven","eight","nine"};

        if(a==1)
        {
            System.out.println(single_digits[b+1]);
        }
        else
        {
            System.out.println(single_digits[b]);
    }//main
}
}
