package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int max = -2147483648; //60

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number:");
            int num = input.nextInt(); // -25,35,15,40,0
if(num > max){ //if the user entered entry is greater than the current maximum number that we have
    max = num; //then user entered number should be the maximum number
}
        }

        System.out.println("maximum number is: " + max);
    }


}
/*
Write a program that can ask the user to enter a number for 5 times and returns the
maximum number
 */