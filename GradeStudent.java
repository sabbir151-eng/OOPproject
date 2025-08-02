package myproject;
import java.util.*;
public class GradeStudent {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = input.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else if (marks >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        input.close();
    }


}
