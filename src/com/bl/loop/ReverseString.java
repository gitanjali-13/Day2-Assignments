package com.bridglebz;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
    String str;
    System.out.println("Enter a string: ");
    Scanner sc = new Scanner(System.in);
    str = sc.nextLine();
    String reversed = reverseString(str);
    System.out.println("The reversed string is: " + reversed);
    sc.close();
    }
    public static String reverseString(String s)
    {
        if (s.isEmpty());
        return s;
        //return reverseString(s.substring(0)+s.charAt(1));
    }
}
