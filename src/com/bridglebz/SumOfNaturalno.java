package com.bridglebz;

import java.util.Scanner;

public class SumOfNaturalno {
    public static void main(String[] args) {
        int n,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++ ){
            sum = sum + i;
        }
        System.out.println("sum is" +sum );

    }
}
