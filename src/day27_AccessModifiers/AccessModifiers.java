package day27_AccessModifiers;

public class AccessModifiers {


    public static int publicDate = 200; // we can access this variable within this class

    protected static int protectedData = 300;

    static int defaultDate = 400;

    private static int privateData = 500; //only from the same class accessible


    public AccessModifiers(){
        //we can create public constructor in the same class
    }

    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("Public");
    }
    static void deafaultMethod(){
        System.out.println("Default");
    }

    private static void privateMethod(){
        System.out.println("Private");
    }


    public static void main(String[] args) {
        System.out.println(publicDate);
        System.out.println(protectedData);
        System.out.println(defaultDate);
        System.out.println(privateData);
    }

}
/*
Let's declare variable and methods and try to access them in other class
We will check if we can print variable publicDate in the other classes
 */