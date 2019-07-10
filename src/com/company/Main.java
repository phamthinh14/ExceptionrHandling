package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, result;
        boolean isDivisible = false;
        Scanner input = new Scanner(System.in);
        while (!isDivisible) {
            System.out.println("Input two integers");
            a = input.nextInt();
            b = input.nextInt();

            try {
                result = a / b;
                System.out.println("Result = " + result);
                isDivisible = true;
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide " + a + " for " + b);
            } finally {
                System.out.println("Finally block will execute.");
            }
        }


    }
}