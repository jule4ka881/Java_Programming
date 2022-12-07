package day04_concatenation;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(100 + 200); // 300
        System.out.println(40 - 10); // 30
        System.out.println(100 / 50); //2 in math 20/6=3.333..
                                      //  in java 20/6.0=3.333..(have to be decimal
                                      // int / double ==== double
        //double / int ==== double
        //double / double ==== double

        System.out.println(50 / 6); //will be 8, have to be decimal to get decimal
        System.out.println(50 / 6.0); // 8.3333...
        System.out.println(50.0 / 6); // will get decimal
        System.out.println(50 / 6); //will be integer
        System.out.println(50d / 6); //will be double
        System.out.println(2.5 / 0.5); // if both are decimal will be decimal
        System.out.println( (int)(2.5 / 0.5)); //will be casted
                               // the denominator can NEVER be "0" !!!
        //System.out.println(9 / 0); will be error

        System.out.println(10 * 2); // 20
        System.out.println(20 * 12); // 240

        System.out.println("-------------MODULUS---------------------");
        /* in math::::::::::::
        Remainder: numerator - (denominator * integer result)
        10 / 3 = 3.333... in math
        10 - (3 * 3) = 1
        20 / 6 = 3.33333...
        20 - (6 * 3) = 2
        15 / 4 = 3.75
        15 - (4 * 3) = 3
         */
        /*
        10 % 3 = 1 // in JAVA
         */
        System.out.println(100 % 13); // the remainder will be 9
        System.out.println(100 % 5); // evenly divisible, the remainder will be zero

    }
}
