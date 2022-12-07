package day06_ifStatements;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

   /*
   Create a class named SingleIfStatementPractice, and write
   a program that can identify if the given number is odd or even
        Ex:
            number = 20
        output:
            20 is an even number: true
            20 is an odd number: false
    */

        int number = 100;

        boolean isEven = number % 2 == 0; //then the number is even
        if(isEven){
            System.out.println("Even number");
        }
        if(!isEven){
            System.out.println("Odd number");
        }
        System.out.println("----------------------------");
        if(number % 2 == 0){
            System.out.println("Even number");
        }
        if(number % 2 != 0){
            System.out.println("Odd number");
        }


    }
}
