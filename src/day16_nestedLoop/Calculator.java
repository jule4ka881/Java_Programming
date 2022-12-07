package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.println("Enter math operator:");
            char o = input.next().charAt(0);
            while (!(o == '+' || o == '-' || o == '*' || o == '/')) { //if invalid, we have to ask to enter valid
                System.out.println("Invalid operator, please re-enter the math operator");
                o = input.next().charAt(0);


            }

            System.out.println("Enter your second number:");
            double num2 = input.nextDouble();

            double result = (o == '+') ? num1 + num2 : (o == '-') ? num1 - num2 : (o == '*') ? num1 * num2
                    : num1 / num2;
            System.out.println("result= " + result);

            System.out.println("Would you like to continue?Yes/No");
            answer = input.next().toLowerCase(); //as long as the answer is yes all those code fragments will be repeated over again

            while(! (answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid answer! Would you like to continue? Yes/No");
                answer = input.next().toLowerCase();
            }
        }

    }
}

/*
Write a program for a simple calculator
1.1 ask the user to enter a number:(double)
1.2 ask the user to enter a math operator: (-,+,*,/)
    if the user enters invalid math operator, repeat the same step until user enters a valid operator
 1.3 ask to enter the second number
 1.4 display the calculation result
 1.5 Would you like to continue?(Yes/No)
 */