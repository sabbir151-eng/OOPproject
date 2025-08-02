package myproject;
import java.util.Scanner;
public class TernaryGreater {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int greater = (a > b) ? a : b;

        System.out.println("Greater number is: " + greater);

        input.close();
    }

}
