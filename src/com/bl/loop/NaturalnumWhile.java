package com.bridglebz;

import java.util.Scanner;

public class NaturalnumWhile {
    public static void main(String[] args) {
        int num, i, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Sum at start: ");
        i = sc.nextInt();
        System.out.print("Sum till: ");
        num = sc.nextInt();
        while(i <= num)
        {

            sum = sum + i;
            i++;
        }

        System.out.println("Sum of Natural Numbers = " + sum);
    }
}