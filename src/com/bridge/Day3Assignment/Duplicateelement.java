package com.bridge.Day3Assignment;

public class Duplicateelement {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 1, 3, 6, 5, 5};
        System.out.println("Calculate Duplicate Number in Given Array");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}