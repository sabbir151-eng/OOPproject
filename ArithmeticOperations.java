package myproject;

import java.util.Scanner;


public class ArithmeticOperations {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = (num2 != 0) ? num1 / num2 : Double.NaN;
        double modulus = (num2 != 0) ? num1 % num2 : Double.NaN;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (num2 != 0) {
            System.out.println("Division: " + division);
            System.out.println("Modulus: " + modulus);
        } else {
            System.out.println("Division and Modulus not possible (division by zero).");
        }

        scanner.close();
    }
}
