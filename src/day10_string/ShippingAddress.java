package day10_string;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Enter from line 17

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();
        System.out.println("fullName = " + fullName); //Cydeo school

        System.out.println("Enter your building number:");
        String buildingNumber = input.next();
        System.out.println("buildingNumber = " + buildingNumber); //7925A + Enter

        input.nextLine(); //to clear the Scanner

        System.out.println("Enter your street name:");
        String streetName = input.nextLine();
        System.out.println("streetName = " + streetName);


        System.out.println("Enter you city name:"); //Jones Branch Dr + Enter
        String cityName = input.nextLine();
        System.out.println("cityName = " + cityName); //Woodbridge + Enter

        System.out.println("Enter your state:");
        String state = input.nextLine();
        System.out.println("state = " + state);

        System.out.println("Enter your zip code:");
        String zipCode = input.next();
        System.out.println("zipCode = " + zipCode);

        // start to write your program

        System.out.println("Your shipping address is:");
        System.out.println("\t" + fullName);
        System.out.println("\t" + buildingNumber + " " + streetName);
        System.out.println("\t" + cityName + ", " + state + " " + zipCode);

        input.close();






    }
}
/*
1. Create a class named ShippingAddress and ask the user to:

1.1 Enter your full name (nextLine() )
1.2.Enter your building Number (next) )
1.3.Enter your street name (nextLine) )
1.4.Enter your city name (nextLine) )
1.5.Enter your state (nextLine) )
1.6.Enter your zipCode (next) )
1.7 Display the shipping address
    Ex:
        Your shipping address is:
            John Smith
            7925 Jones Branch Dr
            McLean, VA 22012
 */