package day25_Constructor;

public class Rectangle {
//we will create instance variables, because we will need separate object's info
    //ATributes:
    public double length, width;

    public Rectangle(double length,double width){
        this.length = length; //this is argument
        this.width = width; //argument as well

    }


    //*public void setInfo(double length, double width){
      //  this.length = length;
        //this.width = width;


    //instance method:
    public double area(){
        return length * width;
    }
//we want to print Rectangle object every time, so we will need toString method
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }
}
