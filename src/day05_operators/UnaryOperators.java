package day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        // pre increment/decrement
        int x = 10;

        System.out.println( ++x ); // 11 immediately
        System.out.println(x); //11

        int y = 100;
        System.out.println( --y ); //99
        System.out.println(y);

        // post increment/decrement

        int z = 32;
        System.out.println( z-- ); //32, not immediatly
        System.out.println(z); //31

        int a = 50;
        System.out.println( a++ ); //50
        System.out.println(a); //51

        int n = 30;
        int m = n++; // m = 30, n = 31
        System.out.println("m = " + m);
        System.out.println("n = " + n);


        int o = 60;
        int q = o--; //q=60; o=59;
        System.out.println("o = " + o); //59
        System.out.println("q = " + q); //60


    }
}
