package day03_variables;

public class PrimitiveDataTypesIntro2 {

    public static void main(String[] args) {

        // Data type char: for single character and ''
        char a = '@';
        char b = '!';
        System.out.println(a);
        System.out.println(b);
        // char ab = 'ab'; - will be compilier, char only takes a single character
        System.out.println("------------------------------");
        char ch1 = 'A';
        char ch2 = 65;
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println("------------------------------");

        // char ch3 = 80000; -out of the char's range (0-65 535)

        char ch3 = 40000; //in the range
        System.out.println(ch3);

        int sum = 'A' + 'B'; // A(65)+B(66)=131 (console)
        System.out.println(sum);

        System.out.println("---------------------------------");

        // boolean r1 = 123; -not for integers
        // boolean r2 = 2.5; -not for decimal numbers
        //boolean r3 = "Java"; -only TRUE or FALSE

        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10; //true
        boolean r7 = 0 < -1; //false

        System.out.println(r6);
        System.out.println(r7);














    }
}
