package day16_nestedLoop;

import java.util.Scanner;

public class LogInDoWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
 String u, p;

 int attempt =3; //if we want 3 attempts only
//without executing the do block first we cannot check the while condition
        do{
            System.out.println("Please enter your username:");
            u=input.next();

            System.out.println("Please enter your password:");
            p = input.next();
attempt--;
if(attempt == 0){
    break; //when the number of attempts reaches 0, should exit the loop
}

        }while(!(u.equals("Cydeo") && p.equals("WoodenSpoon")) ); //while the cred invalid will keep executing


    }
}
