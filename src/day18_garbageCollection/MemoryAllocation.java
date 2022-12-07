package day18_garbageCollection;

class Car{

    public String color;
    public String brand;
    public String model;
}

public class MemoryAllocation {
    public static void main(String[] args) {
int a = 100; //stack
Car car = new Car();
//stack  //heap --> the value will be null
    }

    public static void method1(){
        int b = 200; //stack
    }


    public static void method2(){
        String c = "Hello World";  //object - heap, inside the string pool
                                   //var c - stack

        String d = new String("Hello World");
        //stack           //heap, outside the string pool
    }


}
