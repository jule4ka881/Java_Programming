package day05_operators;

public class RelationalOperators2 {
    public static void main(String[] args) {

        System.out.println('a' > 'b');
        //                  65 > 66 ===> false ASCII table

        System.out.println("----------------------------");
        // ==:
        System.out.println(1000 == 2000); // false
        System.out.println("Java" == "Java"); //true
        System.out.println("Java" == "java"); //false
        System.out.println("Muhtar" == "Good Guy"); // false
        System.out.println(true == false); // false

        System.out.println("------------------------------");
        // !=:
        System.out.println(1000 != 2000); // true
        System.out.println("Java" != "Java"); // false
        System.out.println("Java" != "java"); // true
        System.out.println("Muhtar" != "Good Guy"); // true
        System.out.println(true != false); // true

    }
}
