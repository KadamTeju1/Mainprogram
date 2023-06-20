package com.bridge.Day3Assignment;

public class Reversearray {
    public static void main(String[] args) {
        String name="Tejshree";
        //int lang=name.length();
        int lang=name.length();
        System.out.println(lang);
        String rev="";
        for(int i=lang-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);

        }
        System.out.println(rev);
    }
}
