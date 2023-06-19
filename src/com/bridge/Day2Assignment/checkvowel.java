package com.bridgelabz.basic;
import java.util.Scanner;
public class checkvowel {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the value");
            char z=scanner.nextLine().charAt(0);

            switch(z)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("This character is vowel"+z);

        }
    }
}
