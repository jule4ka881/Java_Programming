package day05_operators;

public class LogicalNotOperator {
    public static void main(String[] args) {

        System.out.println(false);
        String a = "yes";
        boolean yes = a == "yes"; // true
        boolean no = !yes; //false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);
        System.out.println("------------------");
         int score = 65;
         boolean passed = score >= 60;
         boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("-------------------------------");

        System.out.println( true == !false && false == !true && true == !true);
        //                      true       &&       true        &&   false
    }
}
