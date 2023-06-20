package com.bridgelabz.basic;
import java.util.Scanner;
public class Arithmaticprogram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number a:");
        int a=scanner.nextInt();

        System.out.println("Enter the second number b:");
        int b=scanner.nextInt();

        System.out.println("Enter the Third number c:");
        int c=scanner.nextInt();

        int max=Math.max(a,Math.max(b,c));
        int min=Math.min(a,Math.min(b,c));

        System.out.println("Maximum Number"+max);
        System.out.println("Minimum Number"+min);

        int r1=a+b*c;
        int r2=c+a/b;
        int r3=a%b+c;
        int r4=a*b+c;

        System.out.println("a+b*c="+r1);
        System.out.println("c+a/b="+r2);
        System.out.println("a%b+c="+r3);
        System.out.println("a*b+c="+r4);
    }
}
