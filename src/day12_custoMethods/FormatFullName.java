package day12_custoMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = input.next();  //.trim() - to exclude white spaces (only in teh beginning and end of string)
                                          //.trim().replace(" ", "")   (if user entered spaces inside the name)
        System.out.println("Enter your last name:");
        String lastName = input.next();
        input.close();


        String first = "iulIIA"; // we need to get first character as a string by using the substring
        String last = "TSyGankoVA";

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
               //"c"
        // to include it in the name as an upper case "C" we assign it to the variable + remaining characters of the first name

        System.out.println(first);

        last = last.substring(0,1) + last.substring(1).toLowerCase();

        System.out.println(last);
        //System.out.println(first +" "+ last);
        String full_name = first + " " + last;


    }
}
/*
output: Cydeo School
input "cyDEo" "SCHOOL"
 */