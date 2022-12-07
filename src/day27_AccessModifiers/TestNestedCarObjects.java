package day27_AccessModifiers;

public class TestNestedCarObjects {


    public static void main(String[] args) {


        Car obj1 = new Car(); //Car object
        obj1.new CarEngine(); //Car Engine object


       Car.StaticInnerClass obj3 = new Car.StaticInnerClass();
    }
}



