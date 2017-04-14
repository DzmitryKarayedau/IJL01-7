package com.emerline.ijl01_7;

import com.emerline.ijl01_7.utils.PalindromeUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long inputNumber;

        try {
            System.out.print("Input number: ");
            inputNumber = in.nextLong();
            System.out.printf("Number %d is ", inputNumber);
            if (PalindromeUtils.checkOnPalindrome(inputNumber)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
        } catch (InputMismatchException e) {
            System.err.println("Wrong input data");
        }

    }
}
