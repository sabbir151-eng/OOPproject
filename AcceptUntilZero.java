package myproject;
import java.util.*;

public class AcceptUntilZero {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a number (0 to stop): ");
            num = input.nextInt();
        } while (num != 0);

        input.close();
    }

}
