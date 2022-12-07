package day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine(); // scanner using for 1 time

        System.out.println("Enter any word:");

        if(str.length() >= 1){       //if the string has at least one character
                  char f = str.charAt(0);  // we need first character
                                     //multibranch if nested ==>  for 4 conditions
                  if(f >= '0' && f <= '9'){
                      System.out.println("First character is digit");
                  }else if(f >= 'A' && f <= 'Z'){
                      System.out.println("First character is an upper case letter");
                  }else if(f >= 'a' && f <= 'z'){
                      System.out.println("First character is lower case letter");
                  }else{
                      System.out.println("First character is special character");
                  }


        }else{ // if string is empty
            System.out.println("String is empty");
        }

    }
}
/*
ask to enter word
*if digit "First character is digit"
*if lower case "First character is lower case letter"
*if upper case "First character is upper case letter"
HINT: check ASCII table
 */