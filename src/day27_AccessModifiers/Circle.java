package day27_AccessModifiers;

public class Circle {

    public double radius, diameter;
    public static double pi = 3.14; //3.14 - only one value
//this is a constructor:
    public Circle(double radius) { //if we put diameter here we will have to provide 10 additional arg every time we create 10 objects
        this.radius = radius;
        diameter = radius * 2;

    }
//Creating methods:(in order to reuse data we will need to return it from this methods
    public double calcArea(){ //we have to make it instance so it can call those instance vars
return radius * radius * pi;  //if we make it static radius wont be accepted
                              //another reason for making it instance is area is calc differently


    }

    //Calculating the perimeter: we need to use instance vars, so it has to be instance

    public double calcPerimeter(){
        return diameter * pi;
    }
    //another method that can print pi value:

    public static void printPiValue(){   //we can call it through the class name
        System.out.println("PI value is: " + pi);

    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter+
                ", PI=" + pi +
                ", area" + calcArea() +
                ", perimeter" + calcPerimeter() +


                '}';
        //now Circle Class is completed!!!
    }
}
/*
Create a class named Circle:
		Attributes:
			radius, diameter, pi
		Add a constructor that can set All the fields (instances)
		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
 */

