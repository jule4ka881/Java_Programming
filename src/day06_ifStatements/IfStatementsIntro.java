package day06_ifStatements;

public class IfStatementsIntro {

    public static void main(String[] args) {

        int number = -100;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        boolean isNegative2 = number < 0;
        boolean isZero2 = number == 0; //if it's true then i want this code to be executed
        if( isPositive ) {
            System.out.println(number + " is positive number");
        }
        if( isNegative2 ){
            System.out.println( number + " is negative number");
        }
        if(isZero){
            System.out.println( number + " is zero");
        }
        System.out.println("-----------------------------");
        int num = 0;

        if(num < 0){
            System.out.println(num + " is positive number");
        }
         if(num > 0){
             System.out.println(num + " is negative number");
         }
         if(num == 0){
             System.out.println(num + " is zero");
         }

        }
    }

