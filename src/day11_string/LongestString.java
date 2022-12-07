package day11_string;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string 1: ");
        String str1 = input.nextLine();

        System.out.println("Enter string 2: ");
        String str2 = input.nextLine();

        input.close();

        if(str1.length() > str2.length()){
            System.out.println("First string is the longest");

        }else if(str1.length() < str2.length()){
            System.out.println("Second string is the longest");
        }else{
            System.out.println("Equal");
        }


    }


}
/*
Ask the user to enter two strings
Write a program that can print the longest string, if both have the same
number of characters then print "Equal"
 */