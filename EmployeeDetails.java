package myproject;

import java.util.*;

public class EmployeeDetails {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter the employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter the employee department: ");
        String department = sc.nextLine();

        System.out.print("Enter the employee experience (in years): ");
        int experience = sc.nextInt();

        System.out.print("Enter the employee salary: ");
        long salary = sc.nextLong();

        System.out.print("Enter the employee contact number: ");
        long contact = sc.nextLong();

        System.out.print("Is the employee full-time? (true/false): ");
        boolean isFullTime = sc.nextBoolean();

        System.out.println("\n Employee Details : - ");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Salary: " + salary);
        System.out.println("Contact Number: " + contact);
        System.out.println("Full Time Worker: " + (isFullTime ? "Yes" : "No"));

        sc.close();
    }
}