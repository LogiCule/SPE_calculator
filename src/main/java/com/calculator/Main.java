package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("==== Scientific Calculator ====");
        System.out.println("1. Square Root");
        System.out.println("2. Factorial");
        System.out.println("3. Natural Log");
        System.out.println("4. Power");
        System.out.println("5. Exit");

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        System.out.println("Feature coming soon...");

        scanner.close();
    }
}