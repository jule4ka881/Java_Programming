package day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        int a = 1000;
        int b = 200;
        System.out.println( a > b); // true
        System.out.println( a < b); // false

        boolean aIsGreater = a > b;
        System.out.println(aIsGreater);
        System.out.println("----------------------------");

        int score = 75; // 60 will be equal and true too
        boolean passed = score >= 60; // equal or 60 ----- true
        System.out.println(passed);

        System.out.println("------------------------");

        int age = 21;
        boolean eligibleToBuyAlcohol = age >= 21;
        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18;
        System.out.println(eligibleToVote);

        System.out.println("---------------------------");
        System.out.println( 100 > 100 ); //false
        System.out.println( 100 >= 100); //true
        System.out.println( 100 >= 185); // false
        System.out.println("------------------------------");

        score = 48; //don't need int because the variable was assigned already
        boolean failed = score <= 60; // will fail
        System.out.println(failed); // failed is true

        System.out.println( 100 < 2000 ); //true
        System.out.println( 100 < 20 ); // false
        System.out.println("----------------------------------");
}
 }