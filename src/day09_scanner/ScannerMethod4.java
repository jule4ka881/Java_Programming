package day09_scanner;

import java.util.Scanner;

public class ScannerMethod4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner

        System.out.println("Enter your age:");
        int age = input.nextInt();  //21 + Enter

        input.nextLine(); //Enter

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);


    }
}
