package myproject;
import java.util.*;

public class PrintNumbers {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        input.close();
    }

}
