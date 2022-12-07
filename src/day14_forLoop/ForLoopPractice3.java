package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10 ; i++) { //input of 10 numbers and create a sum of them

            System.out.println("Enter a numbers"); //10 times to put number
sum += input.nextInt();


            
        }

        System.out.println("sum = " + sum);
    }
}
