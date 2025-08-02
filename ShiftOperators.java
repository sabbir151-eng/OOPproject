package myproject;
import java.util.Scanner;

public class ShiftOperators {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("Enter shift amount: ");
        int shift = input.nextInt();

        System.out.println("Left shift: " + (num << shift));
        System.out.println("Right shift: " + (num >> shift));

        input.close();
    }
}
