package day07_ifStatements;

public class MonthName {
    public static void main(String[] args) {

        int num = 13;
        String res = "";

        if(num >= 1 && num <= 12){

            if(num == 1){
                res = "January";
            }else if(num == 2){
                res = "February";
            }else if(num == 3){
                res = "March";
            }else if(num == 4){
                res = "April";
            }else if(num == 5){
                res = "May";
            }else if(num == 6){
                res = "June";
            }else if(num == 7){
                res = "July";
            }else if(num == 8){
                res = "August";
            }else if(num == 9){
                res = "September";
            }else if(num == 10){
                res = "October";
            }else if(num == 11){
                res = "November";
            }else{
                res = "December";
            }
            System.out.println(res);




        }else{
            System.out.println("No such a month");
        }



    }
}
/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents.
Ex:
Given:

number = 10

output:

October

Note: Assume that the given number is between 1 ~ 12
 */