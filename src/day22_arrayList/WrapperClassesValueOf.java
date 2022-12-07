package day22_arrayList;

public class WrapperClassesValueOf {
    public static void main(String[] args) {

        String str = "100";
        Integer a1 =Integer.valueOf(str); //the return type will be Integer Wrapper class
// we can assign it to the Integer Wrapper Class variable
        //will be treated as a number
        System.out.println(a1 + 50); //150

        //Double.valueOf();
        //Boolean.valueOf();
    }
}
