package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Enter
        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("Enter your school name:");
        String school_name = input.nextLine();
        System.out.println("Enter your gender:");
        String gender = input.next(); // Male
        System.out.println("Enter your age:");
        int age = input.nextInt(); //28

        input.nextLine(); // additional nextLine method to provide the street name


        System.out.println("Enter the street name:");
        String street = input.nextLine(); // reading enter key first











    }
}
