package myproject;
import java.util.Scanner;
public class ExamResult {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter theory exam score: ");
        int theory = scanner.nextInt();
        System.out.print("Enter practical exam score: ");
        int practical = scanner.nextInt();

        if (theory >= 50 && practical >= 50) {
            System.out.println("Student passed both exams.");
        } else {
            System.out.println("Student did not pass both exams.");
        }
    }
}