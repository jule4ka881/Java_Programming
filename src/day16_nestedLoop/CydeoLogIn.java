package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { //if the credentials are valid
            System.out.println("You are logged in");
        } else { //if credentials are incorrect

            for (int i = 0; i < 3; i++) { //when i: 0,1,2 will be repeated


                if(i != 2){
                    System.err.println("Incorrect username or password, please re-enter");
                }else{
                    System.err.println("This is your last chance, please re-enter your username and password");
                }

                System.out.println("Enter your username");
                u = input.next(); // we have to reassign it, since it's new entry

                System.out.println("Enter your password");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { //if user enters valid cred
                    System.out.println("You are now logged in");
                    break; // exits the loop
                }

            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) { //after all 3 attempts, if they are still incorrect
                System.out.println("Your account is locked, please contact with the support team");
            }
        }

    }
}
/*
assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials. If cred are matched, your program should print "logged in."
If are not matched, the program should allow the user to have three attempts to enter correct cred
if all three are failed, then print "You account is locked"
We also added the requirenment if the user enters incorrect username or password for the second
time we have to print "This is your last chance"..
 */