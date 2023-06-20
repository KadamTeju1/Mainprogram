package com.bridge.Day3Assignment;

public class Ascendingorder {
    public static void main(String[] args)
    {
        int array[] = {1, 4, 2, 6, 3, 5, 7, 9, 8};
        int temp = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Ascending Order");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
