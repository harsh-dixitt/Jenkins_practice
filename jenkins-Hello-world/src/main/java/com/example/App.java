package com.example;

public class App {

    public static void main(String[] args) {
        System.out.println("Step 1: Program started");
        System.out.println("Step 2: Initializing variables");

        int a = 10;
        int b = 20;
        int sum = a + b;

        System.out.println("Step 3: Calculated sum = " + sum);

        if (sum == 30) {
            System.out.println("Step 4: Sum verification passed");
        } else {
            System.out.println("Step 4: Sum verification failed");
        }

        System.out.println("Step 5: Program completed successfully");
    }
}
