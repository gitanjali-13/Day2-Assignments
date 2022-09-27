package com.bridglebz;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        String real, reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome");
        real = scanner.nextLine();
        int length = real.length();
        for ( int i = length - 1; i >= 0; i-- ) {
            reverse = reverse + real.charAt(i);
        }
        if (real.equals(reverse)) {
            System.out.println("Entered string is a palindrome.");
        }
        else
            System.out.println("Entered string isn't a palindrome.");
        }
    }

