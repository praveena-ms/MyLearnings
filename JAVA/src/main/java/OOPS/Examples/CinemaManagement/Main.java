package OOPS.Examples.CinemaManagement;

import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {

        System.out.println("Welcome to Movie Ticket Booking System");
        System.out.println("1. Login");
        System.out.println("2. Create New Account");
        scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                login();
                break;
            case 2:
                createAccount();
                break;
            default:
                System.out.println("Invalid Input !!");
                break;
        }
    }

    private static void login() {
        System.out.println("Enter your email: ");
        String email = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();
    }

    private static void createAccount() {
        System.out.println("Enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Enter your last name: ");
        String lastName = scanner.next();
        System.out.println("Enter your email address: ");
        String email = scanner.next();
        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();
        System.out.println("Confirm password: ");
        String confirmPassword = scanner.next();

        while (!password.equals(confirmPassword)) {
            System.out.println("Password doesn't match !!");
            System.out.println("Re-Enter your password: ");
            password = scanner.next();
            System.out.println("Re-Confirm password: ");
            confirmPassword = scanner.next();
        }
    }
}
