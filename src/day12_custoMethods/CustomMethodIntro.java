package day12_custoMethods;

public class CustomMethodIntro {

    public static void main(String[] args){
// we have to call the method here in the main method

        System.out.println("Test started");

     greetings();

        System.out.println("Test Completed");

        displayMessage();
    }
    public static void greetings(){
        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");
    }

    public static void displayMessage(){

    System.out.println("Hello World!");
    System.out.println("I love Java");
}

}
