package com.bridgelabz.basic;

import java.util.Scanner;

public class Forsum {
    public static void main(String[] args) {
        int sum;
        Scanner s1=new Scanner(System.in);
        int number=s1.nextInt();
        for(sum=0; number!=0; number=number/10)
        {
            sum=sum+number%10;

        }
        System.out.println("sum of digit:"+sum);

    }

}
