package day27_AccessModifiers;

public class Data {
    //we will declare static and instance variables
    public int a, b, c;  //3 instance vars
    public static int d, e, f; //3 static vars



    //here we will declare instance method 1:
    public void method1() {
        System.out.println("Method 1");
    }
                                         //2 instance methods method1 and method2
    public void method2() {
        System.out.println("Method 2");
    }

    public static void method3() {
        System.out.println("Method 3");
    }
                                         //2 static methods method3 and method4
    public static void method4() {
        System.out.println("Method 4");


    }
}
//to figure out the difference between regular import and static import we will use utility class
