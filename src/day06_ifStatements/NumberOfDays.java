package day06_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {

        int n = 10;

        boolean has28Days = n == 2; //if the months number is 2 then 28 days
        boolean has30Days = n == 4 || n == 6 || n == 9 || n == 11;
        boolean has31Days = n == 1 || n == 3 || n == 5 || n == 7 || n == 8
                || n == 10 || n == 12; // = !has28Days && !has30Days
        if(has28Days){
            System.out.println("28 days");
        }
        if(has30Days){
            System.out.println("30 days");
        }
        if(has31Days){
            System.out.println("31 days");
        }

    }
}
/*
1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month
Ex:
Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
 */