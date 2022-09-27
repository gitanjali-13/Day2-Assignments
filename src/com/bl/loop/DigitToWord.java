package com.bridglebz;

import java.util.Scanner;

public class DigitToWord {
        public void pw(int n, String ch) {

            String str[] = { " one", " two", " three", " four", " five", " six", " seven",
                    " eight", " Nine" };

            if (n > 0)
                System.out.print(ch);

        }
        public static void main(String[] args)

        {
            int n = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer number: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.print("Enter numbers greater than 0");
            } else
            {
                DigitToWord a = new DigitToWord();
                System.out.print("After conversion number in words is :" );

            }
        }
    }


