package day27_AccessModifiers;

public class Car { //Outer class:
    public String make,model,color;
    public int year;
    public double price;

    public static int wheels = 4;
    //if we have to create class that is correlated to this Car Class
    //instead of using separate class we will do it nested
    //inner class here:
    public class CarEngine{  //it can access outer class objects
//u can declare only non-static objects here
public void method(){
    System.out.println(make);
    System.out.println(wheels);
}


    }
public static class StaticInnerClass{
        public void method(){
            System.out.println(wheels); //can accept and find only statics
        }
}

}
