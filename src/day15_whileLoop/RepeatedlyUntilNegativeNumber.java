package day15_whileLoop;

import java.util.Scanner;

public class RepeatedlyUntilNegativeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0; //this variable will represent the number that user entered
                   //the initial value is 0 but it will be replaced with the number user entering
        while (num>= 0) {  //while user enters number
            System.out.println("Enter number: "); //as long as user didn't enter negative number
            //it will ask repeatedly to enter number
            num = input.nextInt();
            //after user enters number the condition will be checked again- if it's false(the number is negative) it will stop the loop
        }

    }
}
/*
Write a program that can repeatedly ask the user to enter a number
until user enters a negative number
 */