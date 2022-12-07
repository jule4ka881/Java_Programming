package day22_arrayList;

public class WrapperClasses {
    public static void main(String[] args) {
 //AUTOBOXING ===>>>
        byte a = 10; //a is a primitive value
        //to convert it to the object: use it's wrapper class
        //because most of the data structures do NOT support primitives
Byte b = a; //as soon as we created this byte variable, we can assign byte value to this warpper class
        //that means this primitive is converted to an object Byte
        //now Byte has the value of 10
        System.out.println(b); //10
      //UNBOXING ===>>>
        Double d = 2.5;
        double x = d; //we assigned to primitive value of 2.5
        System.out.println(x); //2.5
    }
}
