package day14_forLoop;

public class OverloadingTheMainMethod {


    public static void main(String[] args) {

        System.out.println("A");

    }
    public static void main(int[] args) {
        System.out.println("B");
    }
    public static void main(double[] args){
        System.out.println("C");
    }
    public static void main(boolean[] args){
        System.out.println("D");
    }

}
/*
there is no point of overloading the main method, cause other main methods
that we created won't get executed, only the main from the system library will
 */