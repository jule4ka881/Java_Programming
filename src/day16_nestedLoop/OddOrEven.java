package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            if(number % 2 == 0){
                System.out.println(number + " is Even");
            }else{
                System.out.println(number + " is Odd");
            }
            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next();

            while( !(answer.equals("yes") || answer.equals("no")) ){ //while user provides invalid entry
                System.err.println("Invalid entry! WOuld you like to enter another number? Yes/No");
                answer = input.next().toLowerCase();
            }

            if(answer.equals("no")){
                break; //if answer is no it will exit both inner and outer loops
            }
        }





    }
}
