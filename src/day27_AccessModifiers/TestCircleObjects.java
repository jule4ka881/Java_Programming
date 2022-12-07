package day27_AccessModifiers;

public class TestCircleObjects {
    public static void main(String[] args) {

        //creating first Circle object and assigning it to circle1:
                        //this constructor will set the diameter as well
        Circle circle1 = new Circle(3.5); //3.5 will be set to the radius
Circle circle2 = new Circle(5); //constructor will get executed separately for both
        Circle circle3 = new Circle(7);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        /*
        System.out.println(circle1.pi); //pi is static can be called through the objects
                                        //will have the same value
        System.out.println(circle1.pi); //pi is static can be called through the objects

        System.out.println(circle1.pi); //pi is static can be called through the objects
        */


        //the right way to call the static is through the class name:
        System.out.println(Circle.pi); //call only through the Class
        System.out.println(circle1.radius); //call only through the object

    }
}
//we will create instances and static members