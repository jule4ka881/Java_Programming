package day03_variables;

public class VariableNamingRules {

    public static void main(String[] args) {
        //age of the student is 28
        //salary of the person is 10000

        int age = 28;
        int salary = 10000;
        System.out.println(age);
        System.out.println(salary);

        // int age = 32; - variable name already exists!

        long phoneNumber = 5715028245L; // camelCase
        System.out.println(phoneNumber);
        double salaryBeforeTax = 100000.5;
        System.out.println(salaryBeforeTax);
        double salary_after_tax = 80000.5; // - underscore
        System.out.println(salary_after_tax);
        double salaryAfterTax$ = 85000.5; // - dollar sign
        System.out.println(salaryAfterTax$);
        System.out.println("-------------------------------");
         int number = 10;
        System.out.println(number);
         int number1 = 20;
        System.out.println(number1);
         int number3 = 30;
        System.out.println(number3);
        //can add digits to make Unique
                           //cannot start with digits
        //double abstract = 5.5; - cannot be reserved java words!!!

        //gender is male
        String gender = "Male";
        String fullName = "Iuliia Tsygankova";

        System.out.println(gender);
        System.out.println(fullName);


        }
}
