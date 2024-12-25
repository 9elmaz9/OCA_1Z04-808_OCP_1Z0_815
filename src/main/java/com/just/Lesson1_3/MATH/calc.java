package com.just.Lesson1_3.MATH;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Ask for the first number
            System.out.println("Enter the first number (or type 'exit' to quit): ");
            if (scanner.hasNext("exit")) {
                System.out.println("Exiting the calculator.");
                break;
            }
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // Clear invalid input
                continue;
            }
            double num1 = scanner.nextDouble();

            // Ask for the operator
            System.out.println("Enter an operator (+, -, *, /): ");
            String operatorInput = scanner.next();

            // Validate the operator
            char operator = operatorInput.charAt(0);
            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("Error: Invalid operator.");
                continue;
            }

            // Ask for the second number
            System.out.println("Enter the second number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // Clear invalid input
                continue;
            }
            double num2 = scanner.nextDouble();

            // Perform the operation
            double result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    break;
            }

            // Show the result and start over with new inputs
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}


