package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {




        //DataType variableName = Data;

        // byte a = "Java"; // byte ONLY excepts integer values (-128 ~ 127)

        // byte a = 20.5; // byte DOESN'T except decimal numbers

        // byte a = 2000; // data is out of the data type (Byte's) range

        byte a = 20;


        //price of the car is $17500

        short p = 17500;

        System.out.println("p");
        System.out.println(p);

        // salary is $95000 - will be int type of data
        int s = 95000; // preffered

        System.out.println(s);

        // int n = 9999999999; // out of int's range

        long n = 9999999999L;
        System.out.println(n);

        //gpa is 3.5

        double gpa = 3.5; // preferred data type for all decimals
        float gpa2 = 3.5f; // add F or f to assign it to float

        System.out.println(gpa);
        System.out.println(gpa2);

    }
}
