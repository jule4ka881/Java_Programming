package day11_string;


import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String correctUsername = "Cydeo",
        correctPassword = "WoodenSpoon";

        System.out.println("Enter username:");
        String userName = input.next();

        System.out.println("Enter password:");
        String password = input.next();

        if(userName.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("You are now logged in");
        }else{
            System.out.println("Incorrect username or password.Please try again");
        }



    }
}
/*
Ask the user to enter the username & password
Print "You are now logged in" If user entered valid username and
password, otherwise print the error message "Incorrect username or password.
Please try again"
Note: Assume that the valid credentials are:
              username: Cydeo
              password: WoodenSpoon
 */