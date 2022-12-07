package day16_nestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        for (;condition;) {
            System.out.println("Hello Cydeo");
        } //will never gets executed cause its false
        System.out.println("--------------------------");

        while(condition){ // will never gets executed as well, the condition is false
            System.out.println("Hello Cydeo");
        }
        System.out.println("-----------------------------");

        do{
            System.out.println("Hello Cydeo");
        }while(condition); //first if the condition is false "Hello Cydeo" will be printed
        //then it checks the condition and getting printed again if the condition is true

    }
}
