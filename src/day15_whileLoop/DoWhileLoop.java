package day15_whileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        int num = 10;
        while(num > 1000){
            System.out.println("Hello World"); //printing after checking the condition num>1000
          //10 is not greater than 1000 so it will never gets printed, not even once
        }

        System.out.println("----------------------------------");

        do{
            System.out.println("Hello World");
        }while(num > 1000);          //the do block gets executed and then the cond gets checked
    }
}
