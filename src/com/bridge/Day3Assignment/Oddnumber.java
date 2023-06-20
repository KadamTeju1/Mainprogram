package com.bridge.Day3Assignment;

public class Oddnumber {
    public static void main(String[] args) {
       int array[]={1,2,3,4,5,6,7};
        System.out.println("Enter odd number");
       for(int i=0;i< array.length;i++)
       {
           if(array[i]%2!=0)
           {
               System.out.println(array[i]);
           }
       }
    }

}
