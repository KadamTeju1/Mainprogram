package com.bridge.workshop1;

public class Sumofarray {
    public static void main(String[] args)
    {

        int sum = 0;
        //int number = 1234;
        int number[]={1,2,3,4};
        //for (sum = 0; number!= 0; number = number / 10)
        //int length;
        for(int i=0;i<number.length;i++)
        {
            //number[i]=number[i]/10;
            sum = sum+number[i];
        }
        System.out.println("sum of digit:"+sum);


    }
}
