package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        while (true) {

            System.out.println("\n==== Scientific Calculator ====");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter number: ");
                        double x = scanner.nextDouble();
                        System.out.println("Result: " + Calculator.squareRoot(x));
                        break;

                    case 2:
                        System.out.print("Enter number: ");
                        long n = scanner.nextLong();
                        System.out.println("Result: " + Calculator.factorial(n));
                        break;

                    case 3:
                        System.out.print("Enter number: ");
                        double logInput = scanner.nextDouble();
                        System.out.println("Result: " + Calculator.naturalLog(logInput));
                        break;

                    case 4:
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();

                        System.out.print("Enter exponent: ");
                        double exponent = scanner.nextDouble();

                        System.out.println("Result: " + Calculator.power(base, exponent));
                        break;

                    case 5:
                        System.out.println("Exiting calculator...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}