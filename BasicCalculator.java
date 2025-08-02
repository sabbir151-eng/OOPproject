package myproject;
import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nPerforming calculations...");

        double sum = num1 + num2;
        System.out.println("Addition ($num_1 + num_2$):       " + sum);

        double difference = num1 - num2;
        System.out.println("Subtraction ($num_1 - num_2$):    " + difference);

        double product = num1 * num2;
        System.out.println("Multiplication ($num_1 * num_2$): " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Division ($num_1 / num_2$):       " + quotient);

            double modulus = num1 % num2;
            System.out.println("Modulus ($num_1 \\% num_2$):        " + modulus);
        } else {
            System.out.println("Division by zero is not possible.");
            System.out.println("Modulus by zero is not possible.");
        }

        scanner.close();
    }


}
