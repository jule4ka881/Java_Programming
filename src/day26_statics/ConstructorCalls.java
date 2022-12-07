package day26_statics;

public class ConstructorCalls {
    // we will build constructor here:
    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }

//we will overload this Constructor here, parameters must be different!!!:
    public ConstructorCalls(int a){
        this();
//constructor call has to be the first step ---------> this();
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }
    public ConstructorCalls(String c){
        this(2.5);
        //this();

        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        method1(); //if method 1 gets called , output will be only from method 1
        System.out.println("-----------------------------------------------");
method2(); //method 1 will get executed first and then method 2


    }

    public static void method1(){
        System.out.println("Method 1");
    }
    public static void method2(){
        method1();
        System.out.println("Method 2");
    }
}
