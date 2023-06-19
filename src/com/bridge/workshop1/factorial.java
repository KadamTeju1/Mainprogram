package com.bridge.workshop1;

public class factorial {
    public static void main(String[] args) {
        int fact=1;
        for(int i=1;i<=3;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial Number:"+fact);
    }
}
