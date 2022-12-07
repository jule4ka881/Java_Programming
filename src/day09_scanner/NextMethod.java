package day09_scanner;

import java.util.Scanner;

public class NextMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = input.next();
        System.out.println(str);
    }
}
