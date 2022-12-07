package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number = 200;
        boolean isPositive = number > 0; // if it's greater than zero, then it's positive
        boolean isNegative = number < 0; // less than zero - negative
        // boolean isZero = number == 0; // if it's equal to zero
        boolean isZero = !isPositive && !isNegative;
        //if the number is not positive and not negative then it's zero
        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);

        /*
        Create a class IdentifyingNumber, and write a program that
        can identify if the given number is positive or negative or zero
        Ex:
            number=200
        output:
            200 is positive number: true
            200 is negative number: false
            200 is zero: false
         */
    }
}
