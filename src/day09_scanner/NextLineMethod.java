package day09_scanner;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a sentence:");
        String str = input.nextLine();
        System.out.println(str);
    }
}
